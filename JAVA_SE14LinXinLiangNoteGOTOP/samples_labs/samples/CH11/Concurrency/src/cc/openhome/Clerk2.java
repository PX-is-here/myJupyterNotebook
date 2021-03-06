package cc.openhome;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clerk2 {
    private int product = -1;
    private Lock lock = new ReentrantLock();
    private Condition producerCond = lock.newCondition();
    private Condition consumerCond = lock.newCondition();

    public void setProduct(int product) throws InterruptedException {
        lock.lock();        
        try {
            waitIfFull();
            this.product = product;
            System.out.printf("生產者設定 (%d)%n", this.product);
            consumerCond.signal();
        } finally {
            lock.unlock();
        }
    }

    private void waitIfFull() throws InterruptedException {
        while(this.product != -1) {
            producerCond.await();
        }
    }

    public int getProduct() throws InterruptedException {
        lock.lock();        
        try {
            waitIfEmpty();
            var p = this.product;
            this.product = -1;
            System.out.printf("消費者取走 (%d)%n", p);
            producerCond.signal();
            return p;
        } finally {
            lock.unlock();
        }
    }

    private void waitIfEmpty() throws InterruptedException {
        while(this.product == -1) {
            consumerCond.await();
        }
    }
}

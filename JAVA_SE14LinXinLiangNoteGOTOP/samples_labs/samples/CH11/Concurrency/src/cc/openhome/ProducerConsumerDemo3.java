package cc.openhome;

import java.util.concurrent.*;

public class ProducerConsumerDemo3 {
    public static void main(String[] args) {
        var queue = new ArrayBlockingQueue<Integer>(1); // 容量為1
        new Thread(new Producer3(queue)).start(); 
        new Thread(new Consumer3(queue)).start(); 
    }    
}

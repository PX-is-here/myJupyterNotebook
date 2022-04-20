package cc.openhome;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        var clerk = new Clerk(); 
        new Thread(new Producer(clerk)).start(); 
        new Thread(new Consumer(clerk)).start(); 
    }    
}

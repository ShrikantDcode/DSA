package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ProducerConsumer {
    private static final int QUEUE_CAPACITY = 10;
    public static void main(String[] args) {
        // Create a BlockingQueue with a fixed capacity
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);

        // Create and start the producer thread
        Thread producerThread = new Thread(new Producer(queue));
        producerThread.start();

        // Create and start the consumer thread
        Thread consumerThread = new Thread(new Consumer(queue));
        consumerThread.start();
    }
}

class Producer implements Runnable {
    BlockingQueue<Integer> queue;
    private int data = 0;
    Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
                try {
                    while (true) {
                        Thread.sleep(300);
                        Integer item = data++;
                        queue.put(item);
                        System.out.println("Produced..."+item);
                        if(item > 10)
                            System.out.println(queue.toString());
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer was interrupted.");
                }
    }
}

class Consumer implements Runnable {
    BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(350);
               Integer item = queue.take();
               System.out.println("Consumed..."+item);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer was interrupted.");
        }
    }
}
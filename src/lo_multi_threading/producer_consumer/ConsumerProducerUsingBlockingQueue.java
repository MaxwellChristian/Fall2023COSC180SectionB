package lo_multi_threading.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducerUsingBlockingQueue {

    private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(2);

    public static void main(String ... args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new ProducerTask());
        executorService.execute(new ConsumerTask());

        executorService.shutdown();
    }

    private static class ProducerTask implements Runnable {

        @Override
        public void run() {
            try {
                int count = 1;
                while (true) {
                    System.out.println("Produced: " + count);
                    buffer.put(count++);
                    Thread.sleep((long) (Math.random() * 2000));
                }
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static class ConsumerTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Consumed: " + buffer.take());
                    Thread.sleep((long) (Math.random() * 2000));
                }
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}

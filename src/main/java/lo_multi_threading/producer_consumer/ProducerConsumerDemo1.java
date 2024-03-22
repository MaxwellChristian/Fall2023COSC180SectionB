package lo_multi_threading.producer_consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo1 {

    public static void main(String []args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Buffer buffer = new Buffer();

        executorService.execute(new ProducerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));

        executorService.shutdown();

    }

}

package lo_multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String ... args) {

        System.out.println("Main : started");

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        System.out.println("Main : threads created");
        System.out.println("Main : threads [before started]");

        executorService.execute(new CustomThread("Thread 1"));
        executorService.execute(new CustomThread("Thread 2"));
        executorService.execute(new CustomThread("Thread 3"));
        executorService.execute(new CustomThread("Thread 4"));
        executorService.execute(new CustomThread("Thread 5"));

        // after shut down of the service, no new threads can be added
        executorService.shutdown();

        while (!executorService.isTerminated());

        System.out.println("Main : After all threads");

    }

}

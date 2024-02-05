package lo_multi_threading;

public class TaskAndThreadDemo3 {

    public static void main(String ... args) {

        System.out.println("Main : started");

        // create a task [runnable task]
        Runnable printA = new Runnable() {
            @Override
            public void run() {
                for (int count = 0 ; count < 100000 ; count++)
                {
                    System.out.print("A");
                }
            }
        };
        PrintB printB = new PrintB();
        Runnable printNumbers = new Runnable() {
            @Override
            public void run() {
                for (int count = 0 ; count < 100000 ; count++)
                {
                    System.out.print(count);
                }
            }
        };

        System.out.println("Main : tasks created");

        // create a thread for the task
        Thread threadForA = new Thread(printA);
        Thread threadForB = new Thread(printB);
        Thread threadForC = new Thread(printNumbers);

//        threadForA.setPriority(Thread.NORM_PRIORITY);
//        threadForB.setPriority(Thread.MIN_PRIORITY);
//        threadForC.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Main : threads created");

        System.out.println("Main : threads [before started]");

        // start the thread
        threadForA.start();
        threadForB.start();
        threadForC.start();

        try {
            threadForA.join();
            System.out.println("ThreadA: Done");

            threadForB.join();
            System.out.println("ThreadB: Done");

            threadForC.join();
            System.out.println("ThreadC: Done");

            System.out.println("Main : After all threads");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    static class PrintB implements Runnable {

        @Override
        public void run() {
            for (int count = 0 ; count < 100000 ; count++)
            {
                System.out.print("B");
            }
        }
    }

}



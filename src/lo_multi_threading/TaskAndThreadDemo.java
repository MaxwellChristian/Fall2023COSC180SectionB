package lo_multi_threading;

public class TaskAndThreadDemo {

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

        System.out.println("Main : threads created");

        System.out.println("Main : threads [before started]");

        // start the thread
        threadForA.start();
        threadForB.start();
        threadForC.start();

        System.out.println("Main : After all threads");

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



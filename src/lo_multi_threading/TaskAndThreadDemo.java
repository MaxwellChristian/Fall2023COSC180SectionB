package lo_multi_threading;

public class TaskAndThreadDemo {

    public static void main(String ... args) {

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

        // create a thread for the task
        Thread threadForA = new Thread(printA);
        Thread threadForB = new Thread(printB);
        Thread threadForC = new Thread(printNumbers);

        // start the thread
        threadForA.start();
        threadForB.start();
        threadForC.start();

    }

}

class PrintB implements Runnable {

    @Override
    public void run() {
        for (int count = 0 ; count < 100000 ; count++)
        {
            System.out.print("B");
        }
    }
}

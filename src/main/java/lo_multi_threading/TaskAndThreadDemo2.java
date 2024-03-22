package lo_multi_threading;

public class TaskAndThreadDemo2 {

    public static void main(String ... args) {

        // create a task [runnable task]

        // create a thread for the task
        Thread threadForA = new Thread(new PrintChar("A"));
        Thread threadForB = new Thread(new PrintChar("B"));
        Thread threadForC = new Thread(new PrintNumber(100000));

        // start the thread
        threadForA.start();
        threadForB.start();
        threadForC.start();

    }

    static class PrintChar implements Runnable {

        String charToPrint;

        public PrintChar(String charToPrint) {
            this.charToPrint = charToPrint;
        }

        @Override
        public void run() {
            for (int count = 0 ; count < 100000 ; count++)
            {
                System.out.print(charToPrint);
            }
        }
    }

    static class PrintNumber implements Runnable {

        int numberUpto;

        public PrintNumber(int numberUpto) {
            this.numberUpto = numberUpto;
        }

        @Override
        public void run() {
            for (int count = 0 ; count < numberUpto ; count++)
            {
                System.out.print(count);
            }
        }
    }

}



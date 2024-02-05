package lo_multi_threading;

public class CustomThread2 extends Thread {
    private final String threadName;
    private final int maxNum;

    public CustomThread2(String threadName, int maxNum) {
        this.threadName = threadName;
        this.maxNum = maxNum;
    }

    @Override
    public void run() {
        for(int count = 1 ; count <= maxNum ; count++){
            // Thread.yield();
            System.out.println(threadName + " : " + count);
            if( count%20==0 ){
                try {
                    System.out.println(threadName + " going to sleep");
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println("Thread " + threadName + " interrupted");
                }
            }
        }

    }
}

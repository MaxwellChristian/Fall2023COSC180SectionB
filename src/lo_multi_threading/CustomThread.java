package lo_multi_threading;

public class CustomThread extends Thread {
    private final String threadName;

    public CustomThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
    }
}

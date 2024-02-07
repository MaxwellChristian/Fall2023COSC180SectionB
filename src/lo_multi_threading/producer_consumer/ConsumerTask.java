package lo_multi_threading.producer_consumer;

public class ConsumerTask implements Runnable {

    Buffer buffer;

    public ConsumerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Consumed: " + buffer.read());
                Thread.sleep((long) (Math.random() * 2000));
            }
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

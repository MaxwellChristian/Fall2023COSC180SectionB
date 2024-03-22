package lo_multi_threading.producer_consumer;

public class ProducerTask implements Runnable {

    Buffer buffer;

    public ProducerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            int count = 1;
            while (true) {
                System.out.println("Produced: " + count);
                buffer.write(count++);
                Thread.sleep((long) (Math.random() * 2000));
            }
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

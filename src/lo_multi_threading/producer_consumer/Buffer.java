package lo_multi_threading.producer_consumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {

    private static final int CAPACITY = 1;
    private LinkedList<Integer> buffer = new LinkedList<>();

    private static Lock lock = new ReentrantLock();

    private static Condition notEmpty = lock.newCondition();
    private static Condition notFull = lock.newCondition();

    public void write(int value) {
        lock.lock();
        try {
            while (buffer.size() == CAPACITY) {
                System.out.println("Waiting for: Not Full");
                notFull.await();
            }

            buffer.offer(value);
            notEmpty.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public int read() {

        int value = 0;

        lock.lock();
        try {
            while (buffer.isEmpty()) {
                System.out.println("Waiting for: Not Empty");
                notEmpty.await();
            }

            value = buffer.remove();
            notFull.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            return value;
        }
    }

}

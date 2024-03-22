package lo_multi_threading.account_example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private String holderFirstName;
    private String holderMiddleName;
    private String holderLastName;

    private double balance = 0;

    Lock lockForBalance = new ReentrantLock();

    public double getBalance() {
        return balance;
    }

    public void deposit( double amountToDeposit ) throws InterruptedException {
        // System.out.printf("Balance: %.2f, Deposit amount: %.2f, ", this.getBalance(), amountToDeposit);

        double newBalance = this.getBalance() + amountToDeposit;
        Thread.sleep(5);
        this.balance = newBalance;

        // System.out.printf("Current Balance: %.2f\n", this.getBalance());
    }

    public synchronized void depositV2( double amountToDeposit ) throws InterruptedException {
        // System.out.printf("Balance: %.2f, Deposit amount: %.2f, ", this.getBalance(), amountToDeposit);

        double newBalance = this.getBalance() + amountToDeposit;
        Thread.sleep(5);
        this.balance = newBalance;

        // System.out.printf("Current Balance: %.2f\n", this.getBalance());
    }

    public void depositV3( double amountToDeposit ) {
        // System.out.printf("Balance: %.2f, Deposit amount: %.2f, ", this.getBalance(), amountToDeposit);

        try {
            Thread.sleep(5);

            // lock before the change
            lockForBalance.lock();

            this.balance = this.balance + amountToDeposit;

            // unlock after the change
            // [done in finally block]

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            // unlock after the change
            lockForBalance.unlock();
        }

        // System.out.printf("Current Balance: %.2f\n", this.getBalance());
    }
}

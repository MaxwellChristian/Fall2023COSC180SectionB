package lo_multi_threading.account_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountDepositWithdrawEx {

    private static Account account = new Account();

    public static void main(String... args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new DepositTask());
        executorService.execute(new WithdrawTask());

        executorService.shutdown();

    }

    public static class Account {

        private static final Lock lock = new ReentrantLock();

        private double balance = 0;

        public double getBalance() {
            return balance;
        }

        public void withdraw(int amount) {
            lock.lock();
            try {

                System.out.println("To Withdraw: " + amount);

                while (balance < amount) {
                    System.out.println("Wait for deposit");
                }

                balance -= amount;
                System.out.println("Withdraw: " + amount + ", Balance: " + getBalance());

            } finally {
                lock.unlock();
            }
        }

        public void deposit(double amount) {

            lock.lock();

            try {
                this.balance += amount;
                System.out.println("Deposit: " + amount + ", Balance: " + getBalance());

            } finally {
                lock.unlock();
            }
        }

    }

    private static class WithdrawTask implements Runnable {

        @Override
        public void run() {
            while (true) {
                account.withdraw((int) (Math.random() * 10) + 1);
            }
        }
    }

    private static class DepositTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    account.deposit((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

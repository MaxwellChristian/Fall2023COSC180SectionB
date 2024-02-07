package lo_multi_threading.account_example;

public class Account {

    private double balance = 0;

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
}

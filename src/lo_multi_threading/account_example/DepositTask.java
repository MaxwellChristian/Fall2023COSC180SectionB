package lo_multi_threading.account_example;

public class DepositTask implements Runnable {

    Account account;
    double amountToDeposit;

    public DepositTask(Account account, int amountToDeposit) {
        this.account = account;
        this.amountToDeposit = amountToDeposit;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random()*2000));
            account.deposit(amountToDeposit);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

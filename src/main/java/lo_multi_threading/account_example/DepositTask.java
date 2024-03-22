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
            // account.deposit(amountToDeposit);    // non-synchronized method
            // account.depositV2(amountToDeposit);  // synchronized method

            // another approach to synchronization
            synchronized (account){
                account.deposit(amountToDeposit); // non-synchronized method
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package lo_multi_threading.account_example;

public class Account {

    private double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void deposit( double amountToDeposit ){
        this.balance += amountToDeposit;
    }
}

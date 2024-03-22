package lo_multi_threading.account_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountDemo {

    private static Account account = new Account();

    public static void main(String []args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // create tasks to execute deposits
        for (int count = 1 ; count <= 10 ; count++) {
            executorService.execute(new DepositTask(account, 10));
        }

        // shut down the executor
        executorService.shutdown();

        // wait while all tasks are completed
        while (!executorService.isTerminated());

        // show the final balance
        System.out.println("Balance: " + account.getBalance());

    }

}


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(0L);

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Long start = System.currentTimeMillis();

        Depositors depositors = new Depositors(bankAccount);
        Withdrawers withdrawers = new Withdrawers(bankAccount);

        for (int i = 0; i < 5; i++) {
            executor.submit(depositors);
            executor.submit(withdrawers);
        }

        executor.shutdown();

        Long end = System.currentTimeMillis();

        System.err.println("Balance: " + bankAccount.getBalance());
        System.err.println("Time: " + (end - start) + " ms");
    }
}

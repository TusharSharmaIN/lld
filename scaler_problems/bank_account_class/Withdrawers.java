
public class Withdrawers implements Runnable {

    private final BankAccount account;

    public Withdrawers(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(1000L);
    }

}

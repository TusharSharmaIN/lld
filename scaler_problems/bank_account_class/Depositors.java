
public class Depositors implements Runnable {

    private final BankAccount account;

    public Depositors(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(2000L);
    }

}


public class BankAccount {

    private Long balance = 0L;

    public BankAccount(Long bal) {
        balance = bal;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long bal) {
        balance = bal;
    }

    public void deposit(Long amount) {
        balance += amount;
    }

    public void withdraw(Long amount) {
        balance -= amount;
    }
}

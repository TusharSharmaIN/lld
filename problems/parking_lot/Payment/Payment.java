package problems.parking_lot.Payment;

public class Payment {
    PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        this.paymentStrategy.processPayment(amount);
    }
}

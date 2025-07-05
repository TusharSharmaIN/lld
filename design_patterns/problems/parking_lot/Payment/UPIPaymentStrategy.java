package design_patterns.problems.parking_lot.Payment;

public class UPIPaymentStrategy implements PaymentStrategy {
    double processingFee;

    public UPIPaymentStrategy() {
        this.processingFee = 0;
    }

    @Override
    public void processPayment(double amount) {
        double fee = processingFee * amount;
        System.out.println("UPI Payment Processing: " + amount + ", (Fee: " + fee + ")");
    }

}

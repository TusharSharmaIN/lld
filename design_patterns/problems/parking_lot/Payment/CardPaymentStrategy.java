package design_patterns.problems.parking_lot.Payment;

public class CardPaymentStrategy implements PaymentStrategy {
    double processingFee;

    public CardPaymentStrategy(double processingFee) {
        this.processingFee = processingFee;
    }

    @Override
    public void processPayment(double amount) {
        double fee = processingFee * amount;
        System.out.println("CARD Payment Processing: " + amount + ", (Fee: " + fee + ")");
    }

}

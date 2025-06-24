package design_patterns.structural.adapter_pattern.payment_processor;

public interface PaymentProcessor {
    void processPayment(double amount, String currency);

    boolean isPaymentSuccessful();

    String getTransactionId();
}

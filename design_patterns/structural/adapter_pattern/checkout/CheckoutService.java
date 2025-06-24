package design_patterns.structural.adapter_pattern.checkout;

import design_patterns.structural.adapter_pattern.payment_processor.PaymentProcessor;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount, String currency) {
        System.out.println("CheckoutSerivce: Processing order: " + amount + " (" + currency + ")");
        paymentProcessor.processPayment(amount, currency);
        if (paymentProcessor.isPaymentSuccessful()) {
            System.out.println("CheckoutSerivce: Order Success! TXN: " + paymentProcessor.getTransactionId());
        } else {
            System.out.println("CheckoutSerivce: Order Failed!");
        }
    }
}
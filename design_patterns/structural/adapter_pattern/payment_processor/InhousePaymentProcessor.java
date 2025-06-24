package design_patterns.structural.adapter_pattern.payment_processor;

public class InhousePaymentProcessor implements PaymentProcessor {
    private String transactionId;
    private boolean isPaymentSuccessful;

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("InhousePaymentProcessor: Initiating Payment of " + amount + " (" + currency + ")");
        this.transactionId = "TXN_" + System.currentTimeMillis();
        this.isPaymentSuccessful = true;
        System.out.println("InhousePaymentProcessor: Payment Done, TXN: " + getTransactionId());
    }

    @Override
    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }

    @Override
    public String getTransactionId() {
       return transactionId;
    }

    
}
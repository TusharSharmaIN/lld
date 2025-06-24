package design_patterns.structural.adapter_pattern.payment_processor;

public class LegacyGatewayAdapter implements PaymentProcessor {
    private final LegacyGateway legacyGateway;
    private long currentRef;

    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("LegacyGatewayAdapter: Translating processPayment() for " + amount + " (" + currency + ")");
        legacyGateway.executeTransaction(amount, currency);
        this.currentRef = legacyGateway.getReferenceNumber();
    }

    @Override
    public boolean isPaymentSuccessful() {
        return legacyGateway.checkStatus(currentRef);
    }

    @Override
    public String getTransactionId() {
        return "LEGACY_" + legacyGateway.getReferenceNumber();
    }

}

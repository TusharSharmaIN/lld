package design_patterns.structural.adapter_pattern.payment_processor;

public class LegacyGateway {
    private long transactionReference;
    private boolean isPaymentSuccessful;

    public void executeTransaction(double totalAmount, String symbol) {
        System.out.println("LegacyGateway: Executing Transaction: " + symbol + " " + totalAmount);
        this.transactionReference = System.nanoTime();
        this.isPaymentSuccessful = true;
        System.out.println("LegacyGateway: Transaction Done, ID: " + getReferenceNumber());
    }

    public boolean checkStatus(long transactionReference) {
        System.out.println("LegacyGateway: Transaction Ref: " + getReferenceNumber());
        return isPaymentSuccessful;
    }

    public long getReferenceNumber() {
        return transactionReference;
    }
}

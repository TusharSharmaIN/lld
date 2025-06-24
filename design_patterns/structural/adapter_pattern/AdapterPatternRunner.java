package design_patterns.structural.adapter_pattern;

import design_patterns.structural.adapter_pattern.checkout.CheckoutService;
import design_patterns.structural.adapter_pattern.payment_processor.*;

public class AdapterPatternRunner {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern Runner");

        // Inhouse processor
        PaymentProcessor processor = new InhousePaymentProcessor();
        CheckoutService checkoutInhouse = new CheckoutService(processor);
        checkoutInhouse.checkout(100, "INR");

        // Legacy processor
        LegacyGateway legacyGateway = new LegacyGateway();
        LegacyGatewayAdapter legacyGatewayProcessor = new LegacyGatewayAdapter(legacyGateway);
        CheckoutService checkoutLegacy = new CheckoutService(legacyGatewayProcessor);
        checkoutLegacy.checkout(200, "INR");
    }
}

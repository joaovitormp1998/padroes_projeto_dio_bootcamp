package infrastructure;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        // Implementação para processamento de pagamento com PayPal
        System.out.println("Processing payment with PayPal");
    }
}

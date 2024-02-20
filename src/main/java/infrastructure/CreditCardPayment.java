package infrastructure;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        // Implementação para processamento de pagamento com cartão de crédito
        System.out.println("Processing payment with credit card");
    }
}

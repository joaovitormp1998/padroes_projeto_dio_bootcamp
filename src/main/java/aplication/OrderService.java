package application;

import domain.InventoryService;
import domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;

    @Autowired
    public OrderService(InventoryService inventoryService, PaymentService paymentService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
    }

    public String processOrder() {
        if (inventoryService.checkInventory()) {
            paymentService.processPayment();
            return "Order processed successfully.";
        } else {
            return "Unable to process order due to insufficient inventory.";
        }
    }
}

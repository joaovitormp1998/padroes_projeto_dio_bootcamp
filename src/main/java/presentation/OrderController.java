package presentation;

import application.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/placeOrder")
    public String placeOrder() {
        // Aqui você pode coordenar as operações relacionadas a pedidos utilizando o OrderService
        String result = orderService.processOrder();
        return "Order placed successfully. Result: " + result;
    }
}

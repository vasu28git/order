package com.example.order.Controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.Entity.Order;
import com.example.order.Services.OrderService;

@RequestMapping("/orders")
@RestController
public class OrderController {
    private final OrderService orderRepository;
    public OrderController(OrderService orderRepository) {
        this.orderRepository = orderRepository;
    }
    @PostMapping("/addOrder")
    public Order createOrder(@RequestBody Order order) {
        System.out.println(order.getOrderNumber());
        System.out.println(order.getUser());
        return orderRepository.save(order);
    }

    @GetMapping("/allOrders")
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}

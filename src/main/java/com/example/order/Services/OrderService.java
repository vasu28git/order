package com.example.order.Services;
import org.springframework.stereotype.Service;
import com.example.order.Entity.Order;
import com.example.order.Repo.OrderRepo;
import java.util.List;


@Service
public class OrderService {
    private final OrderRepo orderRepository;
    public OrderService(OrderRepo orderRepository) {
        this.orderRepository = orderRepository;
    }   
    public Order save(Order order) {
        return orderRepository.save(order);
    }
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}

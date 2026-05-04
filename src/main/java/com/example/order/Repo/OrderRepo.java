package com.example.order.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.Entity.Order;


public interface OrderRepo extends JpaRepository<Order, Integer> {
    
}
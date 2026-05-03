package com.example.order.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") 
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer orderNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getOrderNumber() { return orderNumber; }
    public void setOrderNumber(Integer orderNumber) { this.orderNumber = orderNumber; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}

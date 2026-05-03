package com.example.order.Repo;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.Entity.User;


public interface UserRepo extends JpaRepository<User, UUID> {
    
}
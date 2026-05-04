package com.example.order.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.order.Entity.User;
import com.example.order.Repo.UserRepo;


@Service
public class UserService {
    private final UserRepo userRepository;
    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }  
    public User save(User user) {
        return userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}

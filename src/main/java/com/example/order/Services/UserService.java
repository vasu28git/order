package com.example.order.Services;
import org.springframework.stereotype.Service;
import com.example.order.Entity.User;
import com.example.order.Repo.UserRepo;
import java.util.List;


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
}

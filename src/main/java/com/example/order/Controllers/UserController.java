
package com.example.order.Controllers;
import java.lang.annotation.Repeatable;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.order.Entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.order.Services.UserService;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userRepository;
    public UserController(UserService userRepository) {
        this.userRepository = userRepository;
    }
    
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}

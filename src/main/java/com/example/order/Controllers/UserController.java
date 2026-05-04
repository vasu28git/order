
package com.example.order.Controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.Entity.User;
import com.example.order.Services.UserService;

@CrossOrigin(origins = "*")
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

package com.cognizant.userservice.controller;

import com.cognizant.userservice.entity.User;
import com.cognizant.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.save(user);
    }
}
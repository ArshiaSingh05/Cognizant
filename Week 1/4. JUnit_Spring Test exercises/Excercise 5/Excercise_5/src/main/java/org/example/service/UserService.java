package org.example.service;

import org.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User saveUser(User user) {
        return user;
    }
}
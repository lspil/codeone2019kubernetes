package com.endava.saconf2019e4.controllers;

import com.endava.saconf2019e4.entities.User;
import com.endava.saconf2019e4.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/{username}")
    public void addUser(@PathVariable  String username) {
        User user = new User();
        user.setUsername(username);
        userRepository.save(user);
    }
}

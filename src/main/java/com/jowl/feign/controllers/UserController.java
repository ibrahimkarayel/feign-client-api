package com.jowl.feign.controllers;


import com.jowl.feign.domain.User;
import com.jowl.feign.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getById(@PathVariable(value = "id") long id) {
        User user = userService.findById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();

    }

    @GetMapping("/user/email/{email}")
    public ResponseEntity<User> getByEmail(@PathVariable(value = "email") String email) {
        if (userService.findByEmail(email) != null) {
            return ResponseEntity.ok(userService.findByEmail(email));
        }
        return ResponseEntity.notFound().build();

    }


}

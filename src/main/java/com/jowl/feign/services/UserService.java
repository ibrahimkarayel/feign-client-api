package com.jowl.feign.services;

import com.jowl.feign.domain.User;

import java.util.List;

public interface UserService {
    User findByEmail(String email);

    User findById(long id);

    List<User> findAll();

    User save(User user);
}

package com.jowl.feign.services;

import com.jowl.feign.domain.User;
import com.jowl.feign.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseGet(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}

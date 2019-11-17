package com.jowl.feign.bootstrap;


import com.jowl.feign.domain.User;
import com.jowl.feign.domain.UserBuilder;
import com.jowl.feign.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Order(1)
@Profile("dev")
public class AppUserLoader implements CommandLineRunner {

    private Logger LOGGER = LoggerFactory.getLogger(AppUserLoader.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) {

        User user1 = new UserBuilder()
                .setFirstName("John")
                .setLastName("Snow")
                .setDisplayName("John Snow")
                .setEmail("john@gmail.com")
                .setPassword("$2a$10$RT09hYLCZTRTnqNpvhSm/.w5zkKkb9jlcckoL/gNTliWJuNgZznnK")
                .createUser();

        User user2 = new UserBuilder()
                .setFirstName("Lady")
                .setLastName("Stark")
                .setDisplayName("Lady Stark")
                .setEmail("stark@gmail.com")
                .setPassword("$2a$10$ZVHp6L/FthrsSfu71POqButM7tGtqoemkVHt0mLd3lne.Ao5EeXOW")
                .createUser();


        userRepository.saveAll(List.of(user1, user2));

    }
}

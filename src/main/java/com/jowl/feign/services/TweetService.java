package com.jowl.feign.services;

import com.jowl.feign.domain.Tweet;

import java.util.List;

public interface TweetService {

    Tweet save(Tweet paragraph);

    List<Tweet> findByUserEmail(String email);

}

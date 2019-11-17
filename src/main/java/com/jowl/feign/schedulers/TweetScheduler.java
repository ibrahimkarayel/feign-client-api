package com.jowl.feign.schedulers;

import com.jowl.feign.services.TweetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class TweetScheduler {

    @Autowired
    private TweetService tweetService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TweetScheduler.class);

    private static final long MILLIS_IN_TWELVE_HOURS = 12 * 3600000;

    @Scheduled(initialDelay = 5000, fixedRate = MILLIS_IN_TWELVE_HOURS)
    public void tweet() {

       // Tweet tweet=new Tweet();
        //tweetService.save(tweet);

    }
}

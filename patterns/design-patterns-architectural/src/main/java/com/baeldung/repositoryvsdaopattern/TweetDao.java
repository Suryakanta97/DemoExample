package com.surya.repositoryvsdaopattern;

import java.util.List;

public interface TweetDao {

    List<Tweet> fetchTweets(String email);
    
}

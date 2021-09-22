package com.surya.ctx1;

import org.springframework.stereotype.Service;

import com.surya.parent.IHomeService;

@Service
public class GreetingService implements IHomeService {

    public String getGreeting() {
        return "Greetings for the day";
    }
}

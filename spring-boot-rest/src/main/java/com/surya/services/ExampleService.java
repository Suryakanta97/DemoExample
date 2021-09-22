package com.surya.services;

import org.springframework.stereotype.Service;

import com.surya.requestresponsebody.LoginForm;

@Service
public class ExampleService {

    public boolean fakeAuthenticate(LoginForm lf) {
        return true;
    }
}
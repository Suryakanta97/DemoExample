package com.surya.micronaut.helloworld.server.service;

import javax.inject.Singleton;

@Singleton
public class SpanishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola ";
    }
}

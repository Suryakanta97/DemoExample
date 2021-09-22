package com.surya.contexts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.surya.contexts.Greeting;

@Configuration
@ComponentScan(basePackages = { "com.surya.contexts.services" })
public class RootApplicationConfig {

    @Bean
    public Greeting greeting() {
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello World !!");
        return greeting;
    }
}

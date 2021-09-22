package com.surya.errorhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.surya.errorhandling")
public class ErrorHandlingApplication {

    public static void main(String [] args) {
        System.setProperty("spring.profiles.active", "errorhandling");
        SpringApplication.run(ErrorHandlingApplication.class, args);
    }
}

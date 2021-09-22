package com.surya.testloglevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.surya.testloglevel", "com.surya.component"})
public class TestLogLevelApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLogLevelApplication.class, args);
    }

}

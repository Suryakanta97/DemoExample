package com.surya.dependency.exception.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.surya.dependency.exception")
public class SpringDependenciesExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDependenciesExampleApplication.class, args);
    }
}

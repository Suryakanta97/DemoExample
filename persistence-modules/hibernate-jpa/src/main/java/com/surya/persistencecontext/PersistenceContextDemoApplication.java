package com.surya.persistencecontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.surya.persistencecontext")
public class PersistenceContextDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersistenceContextDemoApplication.class, args);
    }
}

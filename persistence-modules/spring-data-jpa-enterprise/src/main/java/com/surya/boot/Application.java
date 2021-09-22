package com.surya.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.surya.boot")
@EntityScan("com.surya.boot")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

package com.surya.utils;

import javax.annotation.security.RolesAllowed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.surya.utils")
public class UtilsApplication {

    @RolesAllowed("*")
    public static void main(String[] args) {
        SpringApplication.run(UtilsApplication.class, args);
    }

}

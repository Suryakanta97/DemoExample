package com.surya.endpoints.enabling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class }, scanBasePackages = "com.surya.endpoints.enabling")
public class EndpointEnablingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndpointEnablingApplication.class, args);
    }

}

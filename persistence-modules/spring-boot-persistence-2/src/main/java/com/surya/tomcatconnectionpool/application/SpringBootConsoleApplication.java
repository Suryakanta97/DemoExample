package com.surya.tomcatconnectionpool.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.surya.tomcatconnectionpool.application"})
@EnableJpaRepositories(basePackages="com.surya.tomcatconnectionpool.application.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.surya.tomcatconnectionpool.application.entities")
public class SpringBootConsoleApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class);
    }
}

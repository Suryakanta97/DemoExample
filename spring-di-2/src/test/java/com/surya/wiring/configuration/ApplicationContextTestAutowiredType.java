package com.surya.wiring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.surya.dependency.ArbitraryDependency;

@Configuration
public class ApplicationContextTestAutowiredType {

    @Bean
    public ArbitraryDependency autowiredFieldDependency() {
        ArbitraryDependency autowiredFieldDependency = new ArbitraryDependency();
        return autowiredFieldDependency;
    }
}

package com.surya.wiring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.surya.dependency.ArbitraryDependency;
import com.surya.dependency.YetAnotherArbitraryDependency;

@Configuration
public class ApplicationContextTestInjectName {

    @Bean
    public ArbitraryDependency yetAnotherFieldInjectDependency() {
        ArbitraryDependency yetAnotherFieldInjectDependency = new YetAnotherArbitraryDependency();
        return yetAnotherFieldInjectDependency;
    }
}

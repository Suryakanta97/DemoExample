package com.surya.wiring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.surya.dependency.AnotherArbitraryDependency;
import com.surya.dependency.ArbitraryDependency;

@Configuration
public class ApplicationContextTestInjectQualifier {

    @Bean
    public ArbitraryDependency defaultFile() {
        ArbitraryDependency defaultFile = new ArbitraryDependency();
        return defaultFile;
    }

    @Bean
    public ArbitraryDependency namedFile() {
        ArbitraryDependency namedFile = new AnotherArbitraryDependency();
        return namedFile;
    }
}

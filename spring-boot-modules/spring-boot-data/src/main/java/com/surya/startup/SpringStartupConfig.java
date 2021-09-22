package com.surya.startup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.surya.startup")
public class SpringStartupConfig {

    @Bean(initMethod="init")
    public InitMethodExampleBean initMethodExampleBean() {
        return new InitMethodExampleBean();
    }
}
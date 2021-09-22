package com.surya.ex.dataintegrityviolationexception.spring;

import com.surya.spring.config.PersistenceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.surya.ex.dataIntegrityviolationexception.cause3")
@Import(PersistenceConfig.class)
public class Cause3DataContextWithJavaConfig {

    public Cause3DataContextWithJavaConfig() {
        super();
    }

    // beans

}
package com.surya.ex.beancreationexception.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.surya.ex.beancreationexception.cause1")
public class Cause1ContextWithJavaConfig {

    public Cause1ContextWithJavaConfig() {
        super();
    }

    // beans

}
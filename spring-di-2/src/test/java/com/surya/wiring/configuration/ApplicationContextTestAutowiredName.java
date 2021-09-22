package com.surya.wiring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.surya.dependency"})
public class ApplicationContextTestAutowiredName {
}

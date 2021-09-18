package com.surya.couchbase.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.surya.couchbase.spring" })
public class IntegrationTestConfig {
}

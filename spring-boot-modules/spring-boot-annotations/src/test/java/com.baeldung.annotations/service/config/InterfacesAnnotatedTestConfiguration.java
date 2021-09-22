package com.surya.annotations.service.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@TestConfiguration
@ComponentScan("com.surya.annotations.service.interfaces")
public class InterfacesAnnotatedTestConfiguration {

}

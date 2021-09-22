package com.surya.properties;

import com.surya.configurationproperties.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {ConfigProperties.class, AdditionalProperties.class})
public class ConfigPropertiesDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigPropertiesDemoApplication.class, args);
    }

}

package com.surya.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer;
import org.springframework.web.servlet.view.groovy.GroovyMarkupViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.surya.springmvcforms", "com.surya.spring.controller", "com.surya.spring.validator" })
public class GroovyConfiguration {
    
    @Bean
    public GroovyMarkupConfigurer groovyMarkupConfigurer() {
        GroovyMarkupConfigurer configurer = new GroovyMarkupConfigurer();
        configurer.setResourceLoaderPath("/WEB-INF/views/");
        return configurer;
    }
    
    @Bean
    public GroovyMarkupViewResolver thymeleafViewResolver() {
        GroovyMarkupViewResolver viewResolver = new GroovyMarkupViewResolver();
        viewResolver.setSuffix(".tpl");
        return viewResolver;
    }

}

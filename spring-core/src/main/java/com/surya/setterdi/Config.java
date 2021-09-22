package com.surya.setterdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.surya.setterdi.domain.Engine;
import com.surya.setterdi.domain.Trailer;
import com.surya.setterdi.domain.Transmission;

@Configuration
@ComponentScan("com.surya.setterdi")
public class Config {

    @Bean
    public Engine engine() {
        Engine engine = new Engine();
        engine.setType("v8");
        engine.setVolume(5);
        return engine;
    }

    @Bean
    public Transmission transmission() {
        Transmission transmission = new Transmission();
        transmission.setType("sliding");
        return transmission;
    }

    @Bean
    public Trailer trailer() {
        Trailer trailer = new Trailer();
        return trailer;
    }
}
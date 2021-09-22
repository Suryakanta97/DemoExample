package com.surya;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.surya.spring.servicevalidation.SpringServiceLayerValidationApp;

@SpringBootTest(classes = SpringServiceLayerValidationApp.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

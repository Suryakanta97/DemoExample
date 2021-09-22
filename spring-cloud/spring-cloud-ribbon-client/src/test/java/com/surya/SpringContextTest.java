package com.surya;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.surya.spring.cloud.ribbon.client.ServerLocationApp;

@SpringBootTest(classes = ServerLocationApp.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

package com.surya;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.surya.spring.Application;

@SpringBootTest(classes = Application.class)
public class AppContextIntegrationTest {
    @Test
    public void contextLoads() {
    }
}

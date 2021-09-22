package com.surya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.surya.springbootlogging.SpringBootLoggingApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootLoggingApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

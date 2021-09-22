package com.surya.sessionattrs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.surya.sessionattrs.SessionAttrsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SessionAttrsApplication.class})
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

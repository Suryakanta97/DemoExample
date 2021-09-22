package com.surya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.surya.SpringCloudTaskFinal.SpringCloudTaskSinkApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringCloudTaskSinkApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

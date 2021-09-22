package com.surya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.surya.spring.data.gemfire.function.GemfireConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=GemfireConfiguration.class, loader=AnnotationConfigContextLoader.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

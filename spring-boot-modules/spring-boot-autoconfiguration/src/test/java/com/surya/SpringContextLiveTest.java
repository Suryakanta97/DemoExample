package com.surya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.surya.autoconfiguration.MySQLAutoconfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MySQLAutoconfiguration.class)
@WebAppConfiguration
public class SpringContextLiveTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
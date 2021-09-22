package com.surya.spring.cloud.zuulratelimitdemo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.surya.spring.cloud.zuulratelimitdemo.ZuulRatelimitDemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZuulRatelimitDemoApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

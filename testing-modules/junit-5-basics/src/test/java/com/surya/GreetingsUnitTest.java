package com.surya;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.surya.junit5.Greetings;

@RunWith(JUnitPlatform.class)
public class GreetingsUnitTest {

    @Test
    void whenCallingSayHello_thenReturnHello() {
        assertTrue("Hello".equals(Greetings.sayHello()));
    }

}
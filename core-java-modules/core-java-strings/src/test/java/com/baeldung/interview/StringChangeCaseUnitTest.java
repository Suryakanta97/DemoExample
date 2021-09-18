package com.surya.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringChangeCaseUnitTest {
    @Test
    public void givenString_whenChangingToUppercase_thenCaseChanged() {
        String s = "Welcome to surya!";
        assertEquals("WELCOME TO surya!", s.toUpperCase());
    }
    

    @Test
    public void givenString_whenChangingToLowerrcase_thenCaseChanged() {
        String s = "Welcome to surya!";
        assertEquals("welcome to surya!", s.toLowerCase());
    }
}

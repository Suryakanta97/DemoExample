package com.surya.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFormatUnitTest {
    @Test
    public void givenString_whenUsingStringFormat_thenStringFormatted() {
        String title = "surya"; 
        String formatted = String.format("Title is %s", title);
        assertEquals(formatted, "Title is surya");
    }
}

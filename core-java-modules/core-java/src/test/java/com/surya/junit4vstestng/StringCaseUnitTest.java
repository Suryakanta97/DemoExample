package com.surya.junit4vstestng;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringCaseUnitTest {

    private static String data;

    @BeforeClass
    public static void setup() {
        data = "HELLO surya";
    }

    @Test
    public void givenString_whenAllCaps_thenCorrect() {
        assertEquals(data.toUpperCase(), data);
    }

}

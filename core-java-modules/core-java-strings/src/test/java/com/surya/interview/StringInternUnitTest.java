package com.surya.interview;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringInternUnitTest {
    @Test
    public void whenCallingStringIntern_thenStringsInterned() {
        String s1 = "surya";
        String s2 = new String("surya");
        String s3 = new String("surya").intern();
         
        assertThat(s1 == s2).isFalse();
        assertThat(s1 == s3).isTrue();
    }
}

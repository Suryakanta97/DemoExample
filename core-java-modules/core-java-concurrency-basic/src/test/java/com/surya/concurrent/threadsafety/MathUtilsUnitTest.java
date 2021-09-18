package com.surya.concurrent.threadsafety;

import org.junit.Test;

import com.surya.concurrent.threadsafety.mathutils.MathUtils;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class MathUtilsUnitTest {
    
    @Test
    public void whenCalledFactorialMethod_thenCorrect() {
        assertThat(MathUtils.factorial(2)).isEqualTo(new BigInteger("2"));
    }
}

package com.surya.lcm;

import org.junit.Assert;
import org.junit.Test;

import static com.surya.lcm.SimpleAlgorithm.*;

public class SimpleAlgorithmUnitTest {

    @Test
    public void testLCM() {
        Assert.assertEquals(36, lcm(12, 18));
    }

}

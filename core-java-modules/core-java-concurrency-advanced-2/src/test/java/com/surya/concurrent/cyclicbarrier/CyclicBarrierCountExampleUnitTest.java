package com.surya.concurrent.cyclicbarrier;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.surya.concurrent.cyclicbarrier.CyclicBarrierCountExample;

public class CyclicBarrierCountExampleUnitTest {

    @Test
    public void whenCyclicBarrier_notCompleted() {
        CyclicBarrierCountExample ex = new CyclicBarrierCountExample(2);
        boolean isCompleted = ex.callTwiceInSameThread();
        assertFalse(isCompleted);
    }
}

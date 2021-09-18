package com.surya.concurrent.cyclicbarrier;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.surya.concurrent.cyclicbarrier.CyclicBarrierResetExample;

public class CyclicBarrierResetExampleUnitTest {
    
    @Test
    public void whenCyclicBarrier_reset() {
        CyclicBarrierResetExample ex = new CyclicBarrierResetExample(7,20);
        int lineCount = ex.countWaits();
        assertTrue(lineCount > 7);
    }
}

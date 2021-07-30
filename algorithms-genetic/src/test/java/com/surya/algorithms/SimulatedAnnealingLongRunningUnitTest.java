package com.surya.algorithms;

import org.junit.Assert;
import org.junit.Test;

import com.surya.algorithms.ga.annealing.SimulatedAnnealing;

public class SimulatedAnnealingLongRunningUnitTest {

    @Test
    public void testSimulateAnnealing() {
        Assert.assertTrue(SimulatedAnnealing.simulateAnnealing(10, 1000, 0.9) > 0);
    }

}

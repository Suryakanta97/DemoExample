package com.surya.exceptions.nosuchfielderror;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FieldErrorExampleUnitTest {
    
    @Test
    public void whenDependentMessage_returnMessage() {
        
        String dependentMessage = FieldErrorExample.getDependentMessage();
        assertTrue("Hello surya!!".equals(dependentMessage));
    }
    
}
package com.surya.maven.plugins;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.surya.maven.plugins.Data;

public class DataUnitTest {
    @Test
    public void whenDataObjectIsNotCreated_thenItIsNull() {
        Data data = null;
        assertNull(data);
    }
}

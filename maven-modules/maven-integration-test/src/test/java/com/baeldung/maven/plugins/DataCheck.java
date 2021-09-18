package com.surya.maven.plugins;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.surya.maven.plugins.Data;

public class DataCheck {
    @Test
    public void whenDataObjectIsCreated_thenItIsNotNull() {
        Data data = new Data();
        assertNotNull(data);
    }
}

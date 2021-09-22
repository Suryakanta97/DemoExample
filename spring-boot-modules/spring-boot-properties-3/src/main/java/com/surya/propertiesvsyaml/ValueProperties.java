package com.surya.propertiesvsyaml;

import org.springframework.beans.factory.annotation.Value;

public class ValueProperties {

    @Value("${key.something}")
    private String injectedProperty;

    public String getAppName() {
        return injectedProperty;
    }
}

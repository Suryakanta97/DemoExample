package com.surya.immutable;

import org.immutables.value.Value;

@Value.Immutable
public interface Address {
    String getStreetName();
    Integer getNumber();
}

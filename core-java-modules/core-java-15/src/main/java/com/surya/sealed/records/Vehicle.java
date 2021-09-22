package com.surya.sealed.records;

public sealed interface Vehicle permits Car, Truck {

    String getRegistrationNumber();

}

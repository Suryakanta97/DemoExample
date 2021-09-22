package com.surya.jacocoexclusions.service;

import com.surya.jacocoexclusions.generated.Generated;

public class CustomerService {

    //this method will be excluded from coverage due to @Generated.
    @Generated
    public String getProductId() {
        return "An ID";
    }

    public String getCustomerName() {
        return "some name";
    }
}

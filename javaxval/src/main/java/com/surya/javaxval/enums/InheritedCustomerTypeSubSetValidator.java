package com.surya.javaxval.enums;

import com.surya.javaxval.enums.constraints.CustomerTypeSubset;
import com.surya.javaxval.enums.demo.CustomerType;

public class InheritedCustomerTypeSubSetValidator extends EnumSubSetValidator<CustomerTypeSubset, CustomerType> {
    @Override
    public void initialize(CustomerTypeSubset constraint) {
        super.initialize(constraint.anyOf());
    }
}

package com.surya.javaxval.enums;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.surya.javaxval.enums.constraints.CustomerTypeSubset;
import com.surya.javaxval.enums.demo.CustomerType;

public class CustomerTypeSubSetValidator implements ConstraintValidator<CustomerTypeSubset, CustomerType> {
    private CustomerType[] subset;

    @Override
    public void initialize(CustomerTypeSubset constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(CustomerType value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset)
            .contains(value);
    }
}

package com.surya.validation.listvalidation.constraint;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.surya.validation.listvalidation.model.Movie;

public class MaxSizeConstraintValidator implements ConstraintValidator<MaxSizeConstraint, List<Movie>> {

    @Override
    public boolean isValid(List<Movie> values, ConstraintValidatorContext context) {
       return values.size() <= 4;
    }

}

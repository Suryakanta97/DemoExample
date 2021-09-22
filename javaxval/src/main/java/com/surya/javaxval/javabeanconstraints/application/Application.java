package com.surya.javaxval.javabeanconstraints.application;

import javax.validation.Validation;
import javax.validation.Validator;

import com.surya.javaxval.javabeanconstraints.entities.UserNotBlank;

public class Application {

    public static void main(String[] args) {
        Validator validator = Validation.buildDefaultValidatorFactory()
            .getValidator();
        UserNotBlank user = new UserNotBlank(" ");
        validator.validate(user)
            .stream()
            .forEach(violation -> System.out.println(violation.getMessage()));
    }
}

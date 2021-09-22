package com.surya.vavrvalidation.application;

import com.surya.vavrvalidation.model.User;
import com.surya.vavrvalidation.validator.UserValidator;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;

public class Application {

    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        Validation<Seq<String>, User> validation = userValidator.validateUser("John", "john@domain.com");

        // process validation results here
    }	
}

package com.surya.restassured.learner;

class CourseNotFoundException extends RuntimeException {

    CourseNotFoundException(String code) {
        super(code);
    }
}

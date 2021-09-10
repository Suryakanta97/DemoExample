package com.surya.pattern.cleanarchitecture.usercreation;

interface UserFactory {
    User create(String name, String password);
}

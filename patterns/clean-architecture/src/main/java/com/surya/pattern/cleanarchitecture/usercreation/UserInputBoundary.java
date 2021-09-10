package com.surya.pattern.cleanarchitecture.usercreation;

public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}

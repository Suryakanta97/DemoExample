package com.surya.junit5.mockito.repository;

import com.surya.junit5.mockito.User;

public interface UserRepository {

    User insert(User user);
    boolean isUsernameAlreadyExists(String userName);
    
}

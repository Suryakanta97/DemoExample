package com.surya.osiv.service;

import com.surya.osiv.model.BasicUser;

import java.util.Optional;

public interface UserService {
    Optional<BasicUser> findOne(String username);
}

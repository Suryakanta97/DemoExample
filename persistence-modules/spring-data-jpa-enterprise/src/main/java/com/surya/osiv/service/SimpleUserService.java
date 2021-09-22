package com.surya.osiv.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.surya.osiv.model.BasicUser;
import com.surya.osiv.repository.BasicUserRepository;

@Service
public class SimpleUserService implements UserService {

    private final BasicUserRepository userRepository;

    public SimpleUserService(BasicUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<BasicUser> findOne(String username) {
        return userRepository.findDetailedByUsername(username);
    }
}

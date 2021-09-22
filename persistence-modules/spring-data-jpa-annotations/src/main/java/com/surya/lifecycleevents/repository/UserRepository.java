package com.surya.lifecycleevents.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.lifecycleevents.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserName(String userName);
}

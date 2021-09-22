package com.surya.multipledb.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.multipledb.model.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
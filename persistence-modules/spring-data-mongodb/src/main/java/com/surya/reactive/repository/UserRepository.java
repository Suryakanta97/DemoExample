package com.surya.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.surya.model.User;


public interface UserRepository extends ReactiveMongoRepository<User, String> {
}

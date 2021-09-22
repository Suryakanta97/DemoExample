package com.surya.zoneddatetime.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surya.zoneddatetime.model.Action;

public interface ActionRepository extends MongoRepository<Action, String> { }
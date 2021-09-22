package com.surya.beanvalidation.application.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surya.beanvalidation.application.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}

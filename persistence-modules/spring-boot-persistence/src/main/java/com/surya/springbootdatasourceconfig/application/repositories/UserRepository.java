package com.surya.springbootdatasourceconfig.application.repositories;

import com.surya.springbootdatasourceconfig.application.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}

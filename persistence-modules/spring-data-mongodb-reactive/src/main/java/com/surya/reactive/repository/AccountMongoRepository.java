package com.surya.reactive.repository;

import com.surya.reactive.model.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountMongoRepository extends ReactiveMongoRepository<Account, String> {
}

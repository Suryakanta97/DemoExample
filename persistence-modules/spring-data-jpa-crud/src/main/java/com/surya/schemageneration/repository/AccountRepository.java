package com.surya.schemageneration.repository;

import com.surya.schemageneration.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByName(String name);
}

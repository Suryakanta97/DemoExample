package com.surya.springboot.azure;

import org.springframework.data.repository.CrudRepository;

/**
 * @author aiet
 */
public interface UserRepository extends CrudRepository<User, Long> {
}

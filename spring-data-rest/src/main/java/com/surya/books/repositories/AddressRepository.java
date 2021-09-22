package com.surya.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.surya.books.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}

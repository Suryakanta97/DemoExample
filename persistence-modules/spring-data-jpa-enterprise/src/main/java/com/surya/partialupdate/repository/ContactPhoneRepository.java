package com.surya.partialupdate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surya.partialupdate.model.ContactPhone;

@Repository
public interface ContactPhoneRepository extends CrudRepository<ContactPhone, Long> {
    ContactPhone findById(long id);
    ContactPhone findByCustomerId(long id);
}
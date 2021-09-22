package com.surya.mongodb.file.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surya.mongodb.file.models.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}

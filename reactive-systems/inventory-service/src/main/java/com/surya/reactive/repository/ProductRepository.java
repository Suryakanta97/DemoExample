package com.surya.reactive.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.surya.domain.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, ObjectId> {

}

package com.surya.ddd.order.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surya.ddd.order.Order;

public interface OrderMongoRepository extends MongoRepository<Order, String> {

}

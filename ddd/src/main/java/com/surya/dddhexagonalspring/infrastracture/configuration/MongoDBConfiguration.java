package com.surya.dddhexagonalspring.infrastracture.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.surya.dddhexagonalspring.infrastracture.repository.mongo.SpringDataMongoOrderRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {
}

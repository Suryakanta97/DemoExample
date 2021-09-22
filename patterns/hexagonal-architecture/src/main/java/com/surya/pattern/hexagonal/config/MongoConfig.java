package com.surya.pattern.hexagonal.config;

import com.surya.pattern.hexagonal.persistence.MongoRepoEx;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = MongoRepoEx.class)
public class MongoConfig {
}

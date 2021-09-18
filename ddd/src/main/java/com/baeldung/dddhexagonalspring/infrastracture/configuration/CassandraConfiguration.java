package com.surya.dddhexagonalspring.infrastracture.configuration;

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import com.surya.dddhexagonalspring.infrastracture.repository.cassandra.SpringDataCassandraOrderRepository;

@EnableCassandraRepositories(basePackageClasses = SpringDataCassandraOrderRepository.class)
public class CassandraConfiguration {

}

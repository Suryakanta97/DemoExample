package com.surya.reactive.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.surya.domain.Shipment;

public interface ShipmentRepository extends ReactiveMongoRepository<Shipment, ObjectId> {

}

package com.surya.attribute.override.repository;

import com.surya.attribute.override.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}

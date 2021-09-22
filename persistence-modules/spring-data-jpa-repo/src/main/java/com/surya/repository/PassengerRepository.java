package com.surya.repository;

import com.surya.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface PassengerRepository extends JpaRepository<Passenger, Long> {

    List<Passenger> findByFirstNameIgnoreCase(String firstName);

}

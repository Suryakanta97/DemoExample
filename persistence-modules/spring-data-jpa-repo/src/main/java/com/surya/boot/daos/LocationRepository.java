package com.surya.boot.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.boot.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}

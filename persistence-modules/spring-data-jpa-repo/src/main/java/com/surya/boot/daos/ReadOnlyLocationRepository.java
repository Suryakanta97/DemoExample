package com.surya.boot.daos;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.surya.boot.domain.Location;

@org.springframework.stereotype.Repository
public interface ReadOnlyLocationRepository extends Repository<Location, Long> {

    Optional<Location> findById(Long id);

    Location save(Location location);
}

package com.surya.boot.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.boot.domain.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findStoreByLocationId(Long locationId);
}

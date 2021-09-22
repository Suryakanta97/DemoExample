package com.surya.boot.daos;

import org.springframework.data.repository.CrudRepository;

import com.surya.boot.domain.MerchandiseEntity;

public interface InventoryRepository extends CrudRepository<MerchandiseEntity, Long> {
}

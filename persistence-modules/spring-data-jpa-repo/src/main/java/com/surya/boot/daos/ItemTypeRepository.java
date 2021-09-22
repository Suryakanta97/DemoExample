package com.surya.boot.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.boot.domain.ItemType;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Long>, CustomItemTypeRepository, CustomItemRepository {
}

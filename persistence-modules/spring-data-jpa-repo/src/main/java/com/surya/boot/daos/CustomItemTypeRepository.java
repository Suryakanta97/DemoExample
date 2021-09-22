package com.surya.boot.daos;

import org.springframework.stereotype.Repository;

import com.surya.boot.domain.ItemType;

@Repository
public interface CustomItemTypeRepository {

    void deleteCustom(ItemType entity);

    void findThenDelete(Long id);
}

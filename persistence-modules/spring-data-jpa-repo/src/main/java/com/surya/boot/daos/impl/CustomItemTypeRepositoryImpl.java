package com.surya.boot.daos.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.surya.boot.daos.CustomItemTypeRepository;
import com.surya.boot.domain.ItemType;

@Repository
public class CustomItemTypeRepositoryImpl implements CustomItemTypeRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void deleteCustom(ItemType itemType) {
        entityManager.remove(itemType);
    }

    @Override
    public void findThenDelete(Long id) {
        ItemType itemTypeToDelete = entityManager.find(ItemType.class, id);
        entityManager.remove(itemTypeToDelete);
    }
}

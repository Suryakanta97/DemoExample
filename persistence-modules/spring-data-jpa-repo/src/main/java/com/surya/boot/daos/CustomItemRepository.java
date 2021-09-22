package com.surya.boot.daos;

import org.springframework.stereotype.Repository;

import com.surya.boot.domain.Item;

@Repository
public interface CustomItemRepository {

    void deleteCustom(Item entity);

    Item findItemById(Long id);

    void findThenDelete(Long id);

}

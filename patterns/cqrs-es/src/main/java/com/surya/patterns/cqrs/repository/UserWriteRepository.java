package com.surya.patterns.cqrs.repository;

import java.util.HashMap;
import java.util.Map;

import com.surya.patterns.domain.User;

public class UserWriteRepository {

    private Map<String, User> store = new HashMap<>();

    public void addUser(String id, User user) {
        store.put(id, user);
    }

    public User getUser(String id) {
        return store.get(id);
    }

}

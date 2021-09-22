package com.surya.persistence.dao;

import java.util.List;

import com.surya.persistence.model.User;
import com.surya.web.util.SearchCriteria;

public interface IUserDAO {
    List<User> searchUser(List<SearchCriteria> params);

    void save(User entity);
}

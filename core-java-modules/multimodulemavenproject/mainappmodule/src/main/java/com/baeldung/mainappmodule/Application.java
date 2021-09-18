package com.surya.mainappmodule;

import com.surya.daomodule.Dao;
import com.surya.entitymodule.User;
import com.surya.userdaomodule.UserDao;
import java.util.HashMap;
import java.util.Map;

public class Application {
    
    public static void main(String args[]) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Dao userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }
    
}

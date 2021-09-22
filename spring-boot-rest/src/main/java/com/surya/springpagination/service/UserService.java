package com.surya.springpagination.service;

import org.springframework.stereotype.Service;

import com.surya.springpagination.model.Preference;
import com.surya.springpagination.model.User;

@Service
public class UserService implements IUserService {

    @Override
    public User getCurrentUser() {
        
        Preference preference = new Preference();
        preference.setId(1L);
        preference.setTimezone("Asia/Calcutta");
        
        User user = new User();
        user.setId(1L);
        user.setName("Micheal");
        user.setPreference(preference);
                
        return user;
    }
}
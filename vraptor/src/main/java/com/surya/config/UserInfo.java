package com.surya.config;

import com.surya.models.User;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class UserInfo implements Serializable {

    private User user;


    public UserInfo() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

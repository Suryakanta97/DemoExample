package com.surya.roles.rolesauthorities.persistence;

import com.surya.roles.rolesauthorities.model.User;

public interface IUserService {

    User findUserByEmail(String email);

}

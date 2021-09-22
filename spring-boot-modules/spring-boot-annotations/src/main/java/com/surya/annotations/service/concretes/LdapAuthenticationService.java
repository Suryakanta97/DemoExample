package com.surya.annotations.service.concretes;

import com.surya.annotations.service.abstracts.AbstractAuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class LdapAuthenticationService extends AbstractAuthenticationService {

    @Override
    public boolean authenticate(String username, String password) {
        return true;
    }

}
package com.surya.spring.servicevalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.spring.servicevalidation.domain.UserAccount;
import com.surya.spring.servicevalidation.service.UserAccountService;

@RestController
public class UserAccountController {

    @Autowired
    private UserAccountService service;

    @PostMapping("/addUserAccount")
    public Object addUserAccount(@RequestBody UserAccount userAccount) {
        return service.addUserAccount(userAccount);
    }

}

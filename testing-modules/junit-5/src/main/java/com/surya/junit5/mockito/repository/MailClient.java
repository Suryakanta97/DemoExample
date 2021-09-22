package com.surya.junit5.mockito.repository;

import com.surya.junit5.mockito.User;

public interface MailClient {

    void sendUserRegistrationMail(User user);
    
}

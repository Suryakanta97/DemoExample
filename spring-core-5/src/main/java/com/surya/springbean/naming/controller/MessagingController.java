package com.surya.springbean.naming.controller;

import com.surya.springbean.naming.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessagingController {

    @Autowired
    private MessagingService service;
}

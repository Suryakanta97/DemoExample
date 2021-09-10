package com.surya.service;

import com.surya.interceptor.Audited;

public class SuperService {
    @Audited
    public String deliverService(String uid) {
        return uid;
    }
}

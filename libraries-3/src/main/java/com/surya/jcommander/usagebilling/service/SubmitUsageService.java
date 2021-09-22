package com.surya.jcommander.usagebilling.service;

import com.surya.jcommander.usagebilling.model.UsageRequest;

public interface SubmitUsageService {

    static SubmitUsageService getDefault() {
        return new DefaultSubmitUsageService();
    }

    String submit(UsageRequest request);
}

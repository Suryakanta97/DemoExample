package com.surya.jcommander.usagebilling.service;

import com.surya.jcommander.usagebilling.model.CurrentChargesRequest;
import com.surya.jcommander.usagebilling.model.CurrentChargesResponse;

public interface FetchCurrentChargesService {

    static FetchCurrentChargesService getDefault() {
        return new DefaultFetchCurrentChargesService();
    }

    CurrentChargesResponse fetch(CurrentChargesRequest request);
}

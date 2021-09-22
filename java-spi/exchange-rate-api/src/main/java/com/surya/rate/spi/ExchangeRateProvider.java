package com.surya.rate.spi;

import com.surya.rate.api.QuoteManager;

public interface ExchangeRateProvider {
    QuoteManager create();
}
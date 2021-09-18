package com.surya.rate.impl;

import com.surya.rate.api.QuoteManager;
import com.surya.rate.spi.ExchangeRateProvider;

public class YahooFinanceExchangeRateProvider implements ExchangeRateProvider {

    @Override
    public QuoteManager create() {
        return new YahooQuoteManagerImpl();
    }

}
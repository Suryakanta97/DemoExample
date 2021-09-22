package com.surya.beanpostprocessor;

@FunctionalInterface
public interface StockTradeListener {

    void stockTradePublished(StockTrade trade);
}

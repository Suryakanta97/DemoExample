package com.surya.ddd.order.doubledispatch;

public interface DiscountPolicy {
    double discount(Order order);
}

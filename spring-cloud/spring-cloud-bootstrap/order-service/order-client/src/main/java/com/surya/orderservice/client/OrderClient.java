package com.surya.orderservice.client;

public interface OrderClient {

    OrderResponse order(OrderDTO orderDTO);
}

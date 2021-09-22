package com.surya.services;

import java.util.List;

import com.surya.persistence.model.Order;

public interface OrderService {

    List<Order> getAllOrdersForCustomer(String customerId);

    Order getOrderByIdForCustomer(String customerId, String orderId);

}

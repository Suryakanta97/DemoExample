package com.surya.ecommerce.repository;

import com.surya.ecommerce.model.OrderProduct;
import com.surya.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}

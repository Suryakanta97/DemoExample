package com.surya.ddd.order.doubledispatch.visitor;

import com.surya.ddd.order.doubledispatch.Order;
import com.surya.ddd.order.doubledispatch.SpecialOrder;

public interface OrderVisitor {
    void visit(Order order);
    void visit(SpecialOrder order);
}

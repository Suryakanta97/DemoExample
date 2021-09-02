package com.surya.axon.coreapi.exceptions;

public class DuplicateOrderLineException extends IllegalStateException {

    public DuplicateOrderLineException(String productId) {
        super("Cannot duplicate order line for product identifier [" + productId + "]");
    }
}

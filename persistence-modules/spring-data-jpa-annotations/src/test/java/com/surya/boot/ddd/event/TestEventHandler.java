/**
 *
 */
package com.surya.boot.ddd.event;

import org.springframework.transaction.event.TransactionalEventListener;

import com.surya.boot.ddd.event.DomainEvent;

interface TestEventHandler {
    @TransactionalEventListener
    void handleEvent(DomainEvent event);

}

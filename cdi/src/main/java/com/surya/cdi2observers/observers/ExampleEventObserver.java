package com.surya.cdi2observers.observers;

import com.surya.cdi2observers.events.ExampleEvent;
import com.surya.cdi2observers.services.TextService;
import javax.annotation.Priority;
import javax.enterprise.event.Observes;

public class ExampleEventObserver {
    
    public String onEvent(@Observes @Priority(1) ExampleEvent event, TextService textService) {
        return textService.parseText(event.getEventMessage());
    } 
}

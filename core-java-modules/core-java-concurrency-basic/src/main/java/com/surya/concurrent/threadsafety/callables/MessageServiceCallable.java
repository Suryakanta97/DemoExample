package com.surya.concurrent.threadsafety.callables;

import java.util.concurrent.Callable;

import com.surya.concurrent.threadsafety.services.MessageService;

public class MessageServiceCallable implements Callable<String> {
    
    private final MessageService messageService;
    
    public MessageServiceCallable(MessageService messageService) {
        this.messageService = messageService;
    
    }
    
    @Override
    public String call() {
        return messageService.getMesssage();
    }
}

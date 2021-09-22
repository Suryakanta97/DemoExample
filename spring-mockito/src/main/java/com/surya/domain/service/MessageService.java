package com.surya.domain.service;

import com.surya.domain.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message deliverMessage (Message message) {

        return message;
    }
}

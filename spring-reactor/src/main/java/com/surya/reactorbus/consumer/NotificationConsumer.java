package com.surya.reactorbus.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.reactorbus.domain.NotificationData;
import com.surya.reactorbus.service.NotificationService;

import reactor.bus.Event;
import reactor.fn.Consumer;

@Service
public class NotificationConsumer implements Consumer<Event<NotificationData>> {

    @Autowired
    private NotificationService notificationService;

    @Override
    public void accept(Event<NotificationData> notificationDataEvent) {

        NotificationData notificationData = notificationDataEvent.getData();
        try {
            notificationService.initiateNotification(notificationData);
        } catch (InterruptedException e) {
        }

    }

}

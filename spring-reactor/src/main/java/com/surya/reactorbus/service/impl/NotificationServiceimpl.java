package com.surya.reactorbus.service.impl;

import org.springframework.stereotype.Service;

import com.surya.reactorbus.domain.NotificationData;
import com.surya.reactorbus.service.NotificationService;

@Service
public class NotificationServiceimpl implements NotificationService {

    @Override
    public void initiateNotification(NotificationData notificationData) throws InterruptedException {

        System.out.println("Notification service started for Notification ID: " + notificationData.getId());

        Thread.sleep(5000);

        System.out.println("Notification service ended for Notification ID: " + notificationData.getId());
    }

}

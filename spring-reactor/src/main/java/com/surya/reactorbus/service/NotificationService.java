package com.surya.reactorbus.service;

import com.surya.reactorbus.domain.NotificationData;

public interface NotificationService {

    void initiateNotification(NotificationData notificationData) throws InterruptedException;

}

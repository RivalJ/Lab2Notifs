package com.young2rj.lab2notifs;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class NotificationManager {
    NotifcationService service;
    public NotificationManager(@Qualifier("email") NotifcationService service) {
        this.service = service;
    }
    public void sendNotification(String message) {
        service.Send(message);
    }
}

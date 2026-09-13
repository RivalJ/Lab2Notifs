package com.young2rj.lab2notifs;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotifcationService{
    @Override
    public void Send(String message) {
        System.out.printf("Sending SMS: %s", message);
    }
}

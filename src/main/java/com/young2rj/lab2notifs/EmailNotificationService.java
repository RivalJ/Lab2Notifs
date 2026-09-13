package com.young2rj.lab2notifs;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Service
@Primary
public class EmailNotificationService implements NotifcationService {
    @Override
    public void Send(String message) {
        System.out.printf("Sending Email: %s", message);
    }
}

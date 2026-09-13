package com.young2rj.lab2notifs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab2NotifsApplication {

    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(Lab2NotifsApplication.class, args);
        application.getBean(NotificationManager.class).sendNotification("Hello World");

    }

}

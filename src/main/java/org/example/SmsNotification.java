package org.example;

public class SmsNotification implements NotificationService {

    @Override
    public void sendNotifications(String notification) {
        System.out.println("SMS Notification :"+notification);
    }
}

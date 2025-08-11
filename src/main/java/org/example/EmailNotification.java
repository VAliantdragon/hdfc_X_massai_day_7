package org.example;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotifications(String notification) {
        System.out.println("Email Notifications :"+notification);
    }
}

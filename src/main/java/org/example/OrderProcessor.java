package org.example;

public class OrderProcessor {

    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(String orderID){

        String message = "Your order " + orderID + " has been successfully placed.";
        notificationService.sendNotifications(message);

    }
}

package com.dangminhphuc.started.patterns.structural.facade.facade;

import com.dangminhphuc.started.patterns.structural.facade.service.Inventory;
import com.dangminhphuc.started.patterns.structural.facade.service.Notification;
import com.dangminhphuc.started.patterns.structural.facade.service.Payment;
import com.dangminhphuc.started.patterns.structural.facade.service.Shipping;

// Facade: OnlineShoppingFacade
public class OnlineShoppingFacade {
    private final Inventory inventory;
    private final Payment payment;
    private final Shipping shipping;
    private final Notification notification;

    public OnlineShoppingFacade() {
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
        notification = new Notification();
    }

    public void placeOrder(String item, String paymentMethod) {
        System.out.println("* Starting order placement process...");
        if (inventory.checkStock(item)) {
            payment.processPayment(paymentMethod);
            shipping.arrangeShipping(item);
            notification.sendOrderConfirmation(item);
            System.out.println("* Order placed successfully!");
        } else {
            System.out.println("* Sorry, the item is out of stock.");
        }
    }
}

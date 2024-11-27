package com.dangminhphuc.started.patterns.structural.facade.service;

// Subsystem: Notification Service
public class Notification {
    public void sendOrderConfirmation(String item) {
        System.out.println("Sending order confirmation for: " + item);
    }
}

package com.dangminhphuc.started.patterns.structural.facade.service;

// Subsystem: Payment Processing
public class Payment {
    public void processPayment(String paymentMethod) {
        System.out.println("Processing payment with: " + paymentMethod);
    }
}

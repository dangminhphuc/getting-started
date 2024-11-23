package com.dangminhphuc.started.patterns.structural.adapter.adaptee;

public class PayPalService {
    public void paymentWithPayPay(long amount) {
        System.out.println("PayPal: Make payment with $" + amount);
    }
}

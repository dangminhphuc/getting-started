package com.dangminhphuc.started.patterns.structural.adapter.client;

import com.dangminhphuc.started.patterns.structural.adapter.adapter.PaymentProcessor;

public class PaymentService {

    public void makePayment(PaymentProcessor paymentProcessor, long amount) {
        paymentProcessor.payment(amount);
    }
}

package com.dangminhphuc.started.patterns.structural.adapter.adapter;

import com.dangminhphuc.started.patterns.structural.adapter.adaptee.PayPalService;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalService service;

    public PayPalAdapter(PayPalService service) {
        this.service = service;
    }

    @Override
    public void payment(long amount) {
        this.service.paymentWithPayPay(amount);
    }
}

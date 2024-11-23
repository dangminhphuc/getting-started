package com.dangminhphuc.started.patterns.structural.adapter.adapter;


import com.dangminhphuc.started.patterns.structural.adapter.adaptee.NinePayService;

public class NinePayAdapter implements PaymentProcessor {
    private final NinePayService service;

    public NinePayAdapter(NinePayService service) {
        this.service = service;
    }

    @Override
    public void payment(long amount) {
        this.service._9payment(amount);
    }
}

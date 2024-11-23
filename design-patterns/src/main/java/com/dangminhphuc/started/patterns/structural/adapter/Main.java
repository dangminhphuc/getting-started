package com.dangminhphuc.started.patterns.structural.adapter;

import com.dangminhphuc.started.patterns.structural.adapter.adaptee.NinePayService;
import com.dangminhphuc.started.patterns.structural.adapter.adaptee.PayPalService;
import com.dangminhphuc.started.patterns.structural.adapter.adapter.NinePayAdapter;
import com.dangminhphuc.started.patterns.structural.adapter.adapter.PayPalAdapter;
import com.dangminhphuc.started.patterns.structural.adapter.adapter.PaymentProcessor;
import com.dangminhphuc.started.patterns.structural.adapter.client.PaymentService;

public class Main {
    public static void main(String[] args) {
        PayPalService payPalService = new PayPalService();
        NinePayService ninePayService = new NinePayService();

        PaymentProcessor ninePayAdapter = new NinePayAdapter(ninePayService);
        PaymentProcessor paypalAdapter = new PayPalAdapter(payPalService);

        PaymentService service = new PaymentService();
        service.makePayment(ninePayAdapter, 5000);
        service.makePayment(paypalAdapter, 10000);

    }
}

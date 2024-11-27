package com.dangminhphuc.started.patterns.structural.facade;

import com.dangminhphuc.started.patterns.structural.facade.facade.OnlineShoppingFacade;

public class Client {
    public static void main(String[] args) {
        OnlineShoppingFacade shoppingFacade = new OnlineShoppingFacade();
        shoppingFacade.placeOrder("Laptop", "Credit Card");
    }
}

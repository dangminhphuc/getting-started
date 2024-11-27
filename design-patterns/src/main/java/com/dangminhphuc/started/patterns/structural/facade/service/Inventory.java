package com.dangminhphuc.started.patterns.structural.facade.service;

// Subsystem: Inventory Management
public class Inventory {
    public boolean checkStock(String item) {
        System.out.println("Checking stock for: " + item);
        return true; // Assume the item is in stock
    }
}
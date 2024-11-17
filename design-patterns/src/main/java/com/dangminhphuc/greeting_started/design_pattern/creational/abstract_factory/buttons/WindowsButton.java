package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

package com.dangminhphuc.started.patterns.creation.abstractfactory.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

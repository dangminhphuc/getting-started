package com.dangminhphuc.started.patterns.creation.factorymethod.buttons;

/**
 * Windows button implementation.
 */
public class WindowsButton implements Button {

    public void render() {
        System.out.println("This is Windows Button !!!");
    }

    public void onClick() {
        System.out.println("You have clicked button");
    }
}
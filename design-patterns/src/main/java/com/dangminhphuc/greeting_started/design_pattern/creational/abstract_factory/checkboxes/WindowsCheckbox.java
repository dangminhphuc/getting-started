package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}

package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory;

import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons.Button;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons.WindowsButton;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes.Checkbox;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

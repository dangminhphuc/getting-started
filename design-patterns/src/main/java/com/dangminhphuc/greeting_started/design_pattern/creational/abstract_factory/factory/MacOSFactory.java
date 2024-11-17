package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory;

import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons.Button;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons.MacOSButton;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes.Checkbox;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

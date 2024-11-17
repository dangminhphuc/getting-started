package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.app;

import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons.Button;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes.Checkbox;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}

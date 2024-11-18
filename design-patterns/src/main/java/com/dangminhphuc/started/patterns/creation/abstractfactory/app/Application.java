package com.dangminhphuc.started.patterns.creation.abstractfactory.app;

import com.dangminhphuc.started.patterns.creation.abstractfactory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.abstractfactory.checkboxes.Checkbox;
import com.dangminhphuc.started.patterns.creation.abstractfactory.factory.GUIFactory;

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

package com.dangminhphuc.started.patterns.creation.factory.app;

import com.dangminhphuc.started.patterns.creation.factory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.factory.checkboxes.Checkbox;
import com.dangminhphuc.started.patterns.creation.factory.factory.GUIFactory;

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

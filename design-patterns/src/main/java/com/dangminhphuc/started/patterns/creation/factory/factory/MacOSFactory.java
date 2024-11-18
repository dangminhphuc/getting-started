package com.dangminhphuc.started.patterns.creation.factory.factory;

import com.dangminhphuc.started.patterns.creation.factory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.factory.buttons.MacOSButton;
import com.dangminhphuc.started.patterns.creation.factory.checkboxes.Checkbox;
import com.dangminhphuc.started.patterns.creation.factory.checkboxes.MacOSCheckbox;

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

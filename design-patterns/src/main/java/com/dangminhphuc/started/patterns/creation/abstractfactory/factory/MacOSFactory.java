package com.dangminhphuc.started.patterns.creation.abstractfactory.factory;

import com.dangminhphuc.started.patterns.creation.abstractfactory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.abstractfactory.buttons.MacOSButton;
import com.dangminhphuc.started.patterns.creation.abstractfactory.checkboxes.Checkbox;
import com.dangminhphuc.started.patterns.creation.abstractfactory.checkboxes.MacOSCheckbox;

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

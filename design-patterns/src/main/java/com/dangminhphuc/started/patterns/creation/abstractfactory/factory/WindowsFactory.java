package com.dangminhphuc.started.patterns.creation.abstractfactory.factory;

import com.dangminhphuc.started.patterns.creation.abstractfactory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.abstractfactory.buttons.WindowsButton;
import com.dangminhphuc.started.patterns.creation.abstractfactory.checkboxes.Checkbox;
import com.dangminhphuc.started.patterns.creation.abstractfactory.checkboxes.WindowsCheckbox;

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

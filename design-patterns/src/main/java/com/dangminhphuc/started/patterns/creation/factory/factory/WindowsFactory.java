package com.dangminhphuc.started.patterns.creation.factory.factory;

import com.dangminhphuc.started.patterns.creation.factory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.factory.buttons.WindowsButton;
import com.dangminhphuc.started.patterns.creation.factory.checkboxes.Checkbox;
import com.dangminhphuc.started.patterns.creation.factory.checkboxes.WindowsCheckbox;

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

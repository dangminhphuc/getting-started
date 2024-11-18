package com.dangminhphuc.started.patterns.creation.factory.factory;

import com.dangminhphuc.started.patterns.creation.factory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
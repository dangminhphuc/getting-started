package com.dangminhphuc.started.patterns.creation.abstractfactory.factory;

import com.dangminhphuc.started.patterns.creation.abstractfactory.buttons.Button;
import com.dangminhphuc.started.patterns.creation.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
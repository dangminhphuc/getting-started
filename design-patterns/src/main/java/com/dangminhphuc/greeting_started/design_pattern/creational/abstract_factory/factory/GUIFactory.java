package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory;

import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.buttons.Button;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
package com.dangminhphuc.started.patterns.creation.factorymethod.factory;

import com.dangminhphuc.started.patterns.creation.factorymethod.buttons.Button;
import com.dangminhphuc.started.patterns.creation.factorymethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

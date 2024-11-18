package com.dangminhphuc.started.patterns.creation.factorymethod.factory;

import com.dangminhphuc.started.patterns.creation.factorymethod.buttons.Button;
import com.dangminhphuc.started.patterns.creation.factorymethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
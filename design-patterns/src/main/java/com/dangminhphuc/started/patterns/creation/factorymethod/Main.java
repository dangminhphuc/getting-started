package com.dangminhphuc.started.patterns.creation.factorymethod;

import com.dangminhphuc.started.patterns.creation.factorymethod.factory.Dialog;
import com.dangminhphuc.started.patterns.creation.factorymethod.factory.HtmlDialog;
import com.dangminhphuc.started.patterns.creation.factorymethod.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure("Windows 10");
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure(String osName) {
        if (osName.equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

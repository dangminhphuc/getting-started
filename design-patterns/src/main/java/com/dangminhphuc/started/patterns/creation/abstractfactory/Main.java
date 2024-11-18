package com.dangminhphuc.started.patterns.creation.abstractfactory;

import com.dangminhphuc.started.patterns.creation.abstractfactory.app.Application;
import com.dangminhphuc.started.patterns.creation.abstractfactory.factory.GUIFactory;
import com.dangminhphuc.started.patterns.creation.abstractfactory.factory.MacOSFactory;
import com.dangminhphuc.started.patterns.creation.abstractfactory.factory.WindowsFactory;

public class Main {
    private static Application getApplicationConfigure(String os) {
        GUIFactory factory;
        switch (os) {
            case "MacOS": {
                factory = new MacOSFactory();
                break;
            }
            case "Windows": {
                factory = new WindowsFactory();
                break;
            }
            default: {
                throw new RuntimeException("Invalid OS, must be MacOS or Windows");
            }
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application application = getApplicationConfigure("Windows");
        application.paint();
    }
}

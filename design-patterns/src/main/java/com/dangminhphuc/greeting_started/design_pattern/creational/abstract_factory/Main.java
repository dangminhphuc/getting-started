package com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory;

import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.app.Application;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory.GUIFactory;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory.MacOSFactory;
import com.dangminhphuc.greeting_started.design_pattern.creational.abstract_factory.factory.WindowsFactory;

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

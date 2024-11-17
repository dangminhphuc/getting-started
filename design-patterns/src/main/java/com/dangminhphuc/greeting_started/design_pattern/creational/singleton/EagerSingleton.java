package com.dangminhphuc.greeting_started.design_pattern.creational.singleton;

public class EagerSingleton {
    // Instance created at class loading
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents instantiation
    private EagerSingleton() {
    }

    // Global access point
    public static EagerSingleton getInstance() {
        return instance;
    }
}

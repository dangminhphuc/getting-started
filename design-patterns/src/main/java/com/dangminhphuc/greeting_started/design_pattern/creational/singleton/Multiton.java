package com.dangminhphuc.greeting_started.design_pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private static final Map<String, Multiton> INSTANCES = new HashMap<>();
    private final String value;

    private Multiton(String value) {
        this.value = value;
    }

    public static synchronized Multiton getInstance(String key) {
        INSTANCES.putIfAbsent(key, new Multiton(key));
        return INSTANCES.get(key);
    }

    public String getValue() {
        return value;
    }
}

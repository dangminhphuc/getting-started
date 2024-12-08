package com.dangminhphuc.started.patterns.behavior.command.command;

import com.dangminhphuc.started.patterns.behavior.command.receiver.Light;

// concrete command
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

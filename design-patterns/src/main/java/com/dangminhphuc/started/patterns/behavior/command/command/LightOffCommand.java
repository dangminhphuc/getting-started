package com.dangminhphuc.started.patterns.behavior.command.command;

import com.dangminhphuc.started.patterns.behavior.command.receiver.Light;

// concrete command
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
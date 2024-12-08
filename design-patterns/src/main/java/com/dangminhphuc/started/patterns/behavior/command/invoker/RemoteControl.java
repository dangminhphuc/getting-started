package com.dangminhphuc.started.patterns.behavior.command.invoker;

import com.dangminhphuc.started.patterns.behavior.command.command.Command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<String, Command> commands = new HashMap<>();

    public void setCommand(String button, Command command) {
        commands.put(button, command);
    }

    public void pressButton(String button) {
        Command command = commands.get(button);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned to button: " + button);
        }
    }

    public void pressUndo(String button) {
        Command command = commands.get(button);
        if (command != null) {
            command.undo();
        } else {
            System.out.println("No command assigned to button: " + button);
        }
    }
}

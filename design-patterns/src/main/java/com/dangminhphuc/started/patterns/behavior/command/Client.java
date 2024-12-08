package com.dangminhphuc.started.patterns.behavior.command;

import com.dangminhphuc.started.patterns.behavior.command.command.Command;
import com.dangminhphuc.started.patterns.behavior.command.command.LightOffCommand;
import com.dangminhphuc.started.patterns.behavior.command.command.LightOnCommand;
import com.dangminhphuc.started.patterns.behavior.command.invoker.RemoteControl;
import com.dangminhphuc.started.patterns.behavior.command.receiver.Light;

// The client is now responsible for wiring up commands, but it doesn't manage their execution.
// This makes the setup reusable for different invokers.
public class Client {
    public static void main(String[] args) {
        // Receivers
        Light livingRoomLight = new Light();

        // Commands
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();
        remote.setCommand("ON", lightOnCommand);
        remote.setCommand("OFF", lightOffCommand);

        // Execution
        remote.pressButton("ON");  // Output: The light is ON.
        remote.pressUndo("ON");    // Output: The light is OFF.
        remote.pressButton("OFF"); // Output: The light is OFF.
        remote.pressUndo("OFF");   // Output: The light is ON.
    }
}
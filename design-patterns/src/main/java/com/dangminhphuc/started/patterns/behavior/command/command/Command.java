package com.dangminhphuc.started.patterns.behavior.command.command;

public interface Command {
    void execute();

    void undo();
}

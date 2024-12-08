package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers;

public class ConcreteHandlerA extends AbstractHandler {
    @Override
    public void handle(String request) {
        if (request.contains("A")) {
            System.out.println("Request handled by Handler A");
        }
        if (this.nextHandler != null) {
            this.nextHandler.handle(request);
        }
    }
}

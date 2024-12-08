package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers;

public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handle(String request) {
        if (request.contains("B")) {
            System.out.println("Request handled by Handler B");
        }
        if (this.nextHandler != null) {
            this.nextHandler.handle(request);
        }
    }
}

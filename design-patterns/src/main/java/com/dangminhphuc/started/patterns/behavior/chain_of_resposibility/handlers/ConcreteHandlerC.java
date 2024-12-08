package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers;

public class ConcreteHandlerC extends AbstractHandler {
    @Override
    public void handle(String request) {
        if (request.contains("C")) {
            System.out.println("Request handled by Handler C");
        }
        if (this.nextHandler != null) {
            this.nextHandler.handle(request);
        }
    }
}

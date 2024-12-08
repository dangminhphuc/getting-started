package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers;

public class HandlerManager {
    private final Handler handler;

    public HandlerManager() {
        this.handler = new ConcreteHandlerA();
        this.handler
                .setNext(new ConcreteHandlerB())
                .setNext(new ConcreteHandlerC());

    }

    public void handle(String request) {
        this.handler.handle(request);
    }

}

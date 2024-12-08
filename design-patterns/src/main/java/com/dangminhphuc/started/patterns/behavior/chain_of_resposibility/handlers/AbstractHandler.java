package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers;

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        return this.nextHandler = handler;
    }
}

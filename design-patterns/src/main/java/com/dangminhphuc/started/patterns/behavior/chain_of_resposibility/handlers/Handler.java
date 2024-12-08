package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers;

public interface Handler {
    Handler setNext(Handler handler);

    void handle(String request);
}

package com.dangminhphuc.started.patterns.behavior.chain_of_resposibility;

import com.dangminhphuc.started.patterns.behavior.chain_of_resposibility.handlers.HandlerManager;

public class Client {
    public static void main(String[] args) {
       HandlerManager manager = new HandlerManager();

       manager.handle("AB");
       manager.handle("BC");
       manager.handle("AC");
    }
}

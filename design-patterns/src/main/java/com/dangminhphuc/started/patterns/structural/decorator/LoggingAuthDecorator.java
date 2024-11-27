package com.dangminhphuc.started.patterns.structural.decorator;

public class LoggingAuthDecorator extends AuthDecorator {
    public LoggingAuthDecorator(AuthService authService) {
        super(authService);
    }

    @Override
    public void authenticate(String username, String password) {
        System.out.println("Logging attempt for user: " + username);
        super.authenticate(username, password);
    }
}

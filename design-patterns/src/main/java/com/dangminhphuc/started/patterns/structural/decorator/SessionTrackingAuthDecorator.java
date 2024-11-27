package com.dangminhphuc.started.patterns.structural.decorator;

public class SessionTrackingAuthDecorator extends AuthDecorator {
    public SessionTrackingAuthDecorator(AuthService authService) {
        super(authService);
    }

    @Override
    public void authenticate(String username, String password) {
        long startTime = System.currentTimeMillis();
        super.authenticate(username, password);
        long endTime = System.currentTimeMillis();
        System.out.println("Session started for user: " + username + ". Authentication took " + (endTime - startTime) + "ms.");
    }
}

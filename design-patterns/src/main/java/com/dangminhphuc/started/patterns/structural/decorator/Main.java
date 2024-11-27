package com.dangminhphuc.started.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        // Base authentication service
        AuthService authService = new BasicAuthService();

        // Add logging
        authService = new LoggingAuthDecorator(authService);

        // Add 2FA
        authService = new TwoFactorAuthDecorator(authService);

        // Add session tracking
        authService = new SessionTrackingAuthDecorator(authService);

        // Authenticate a user
        try {
            authService.authenticate("admin", "password");
        } catch (SecurityException e) {
            System.err.println(e.getMessage());
        }
    }
}


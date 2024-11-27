package com.dangminhphuc.started.patterns.structural.decorator;

public class TwoFactorAuthDecorator extends AuthDecorator {
    public TwoFactorAuthDecorator(AuthService authService) {
        super(authService);
    }

    @Override
    public void authenticate(String username, String password) {
        super.authenticate(username, password);
        System.out.println("Performing 2FA for user: " + username);
        // Simulate 2FA verification
        System.out.println("2FA successful for user: " + username);
    }
}

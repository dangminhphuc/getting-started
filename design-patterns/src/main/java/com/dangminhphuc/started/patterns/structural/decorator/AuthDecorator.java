package com.dangminhphuc.started.patterns.structural.decorator;

// Base Decorator
public abstract class AuthDecorator implements AuthService {
    protected AuthService authService;

    public AuthDecorator(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public void authenticate(String username, String password) {
        System.out.println("==========");
        authService.authenticate(username, password);
    }
}


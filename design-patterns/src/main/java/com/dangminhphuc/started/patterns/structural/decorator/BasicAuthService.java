package com.dangminhphuc.started.patterns.structural.decorator;

// Concrete Component
public class BasicAuthService implements AuthService {

    @Override
    public void authenticate(String username, String password) {
        System.out.println("Authenticating user: " + username);
        // Simulate basic authentication (e.g., database lookup)
        if ("admin".equals(username) && "password".equals(password)) {
            System.out.println("Authentication successful for user: " + username);
        } else {
            System.out.println("Authentication failed for user: " + username);
            throw new SecurityException("Invalid credentials");
        }
    }
}

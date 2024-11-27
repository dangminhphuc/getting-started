package com.dangminhphuc.started.patterns.structural.decorator;

// Base Component
public interface AuthService {
    void authenticate(String username, String password);
}
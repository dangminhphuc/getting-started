package com.dangminhphuc.started.patterns.structural.composite;

// Leaf
public class Employee implements Organization {
    private final int code;
    private final String name;
    private final String position;
    private final double budget;

    public Employee(int code, String name, String position, double budget) {
        this.code = code;
        this.name = name;
        this.position = position;
        this.budget = budget;
    }

    @Override
    public void details() {
        System.out.println("Employee details: [" + this.code + "]" + this.name + ", position: " + this.position);
    }

    @Override
    public double getBudget() {
        return this.budget;
    }
}

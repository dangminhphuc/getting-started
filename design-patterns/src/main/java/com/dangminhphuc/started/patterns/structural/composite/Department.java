package com.dangminhphuc.started.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Department implements Organization {
    private final String name;

    public Department(String name) {
        this.name = name;
    }

    private final List<Organization> employees = new ArrayList<>();

    public void add(Organization component) {
        this.employees.add(component);
    }

    public void remove(Organization component) {
        this.employees.remove(component);
    }

    @Override
    public void details() {
        System.out.println("Department [" + this.name + "]:");
        this.employees.forEach(Organization::details);
    }

    @Override
    public double getBudget() {
        double totalBudget = 0L;
        for (Organization organization : this.employees) {
            totalBudget += organization.getBudget();
        }
        return totalBudget;
    }
}

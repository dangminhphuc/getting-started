package com.dangminhphuc.started.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee(1,"Alice", "Developer", 70000);
        Employee emp2 = new Employee(2,"Bob", "Designer", 65000);
        Employee emp3 = new Employee(3, "Charlie", "Tester", 60000);
        Employee emp4 = new Employee(4,"Daisy", "Manager", 120000);

        // Create sub-department
        Department engineering = new Department("Engineering");
        engineering.add(emp1);
        engineering.add(emp3);

        // Create another sub-department
        Department design = new Department("Design");
        design.add(emp2);

        // Create a main department and add sub-departments and individual employees
        Department company = new Department("Company");
        company.add(engineering);
        company.add(design);
        company.add(emp4); // Daisy as manager

        // Display the hierarchy and budget
        System.out.println("Company Hierarchy:");
        company.details();

        System.out.println("\nTotal Company Budget: $" + company.getBudget());
    }
}

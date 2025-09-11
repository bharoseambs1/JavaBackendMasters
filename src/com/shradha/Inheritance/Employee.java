package com.shradha.Inheritance;

// Parent class
class Employee {
    double salary;

    // Constructor
    Employee(double salary) {
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

// Child class
class Manager extends Employee {
    double bonus;

    // Constructor
    Manager(double salary, double bonus) {
        super(salary); // call parent constructor
        this.bonus = bonus;
    }

    void displayDetails() {
        super.displaySalary(); // access parent's method
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Income: " + (super.salary + bonus)); // access parent's variable
    }
    public static void main(String[] args) {
        // Create Manager object
        Manager m1 = new Manager(50000, 10000);

        // Display details
        m1.displayDetails();
    }
}


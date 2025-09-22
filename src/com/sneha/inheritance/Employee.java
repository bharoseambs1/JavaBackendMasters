package com.sneha.inheritance;

public class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }
    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}


package com.gaurav.constructor;

public class Employee {

    private int id;
    private String name;
    private double salary;
    public Employee() {
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);

    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayDetails();

        Employee e1 = new Employee(1, "Gaurav", 10000.0);
        e1.displayDetails();
    }
}
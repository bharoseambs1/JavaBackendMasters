package com.satish.java8features;

import java.util.List;

public class TestEmployeeWithStreamAPI {
    public static void main(String[] args) {

        List<Employee> employeeList = List.of(
                new Employee(101, "Satish", 85000, "IT"),
                new Employee(114, "Shradha", 72000, "IT"),  //yes
                new Employee(102, "Anita", 60000, "HR"),
                new Employee(103, "Ramesh", 55000, "IT"),
                new Employee(104, "Sunita", 70000, "Finance"),
                new Employee(105, "Vikram", 65000, "HR"),
                new Employee(106, "Prajakta", 72000, "Finance"),
                new Employee(107, "Amit", 48000, "IT"),
                new Employee(108, "Neha", 53000, "HR"),
                new Employee(109, "Karan", 80000, "Finance"),
                new Employee(110, "Pooja", 62000, "IT"),  //yes
                new Employee(111, "Pooja", 92000, "IT"), //yes
                new Employee(112, "Ritu", 58000, "HR"),
                new Employee(113, "Pooja", 62000, "IT")); //yes

        // Example: Find all employees in the IT department with a salary greater than 60000
        System.out.println("Employees in IT department with salary > 60000:");
        employeeList   //collection    14
                .stream()  //convert collection to stream    14
                .filter( e -> e.department.equals("IT") && e.salary > 60000)  //4
                .forEach(System.out::println); //4
                //.forEach(e -> System.out.println(e.name + " - " + e.salary)); //4

        //stream intermediate operation: filter
        //stream terminal operation: forEach

        System.out.println("##############");
        employeeList
                .stream()
                .map(emp -> emp.department)
                .distinct()
                .forEach(dept -> System.out.println(dept));

        //find out the employee from IT department only
        System.out.println("##############");
        employeeList
                .stream()
                .filter(e -> e.department.equalsIgnoreCase("it"))
                .forEach(e -> System.out.println(e));

        //find out the highest salary employee
        System.out.println("##############");
        employeeList  //14
                .stream()  //14
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))  //14 sorted by salary
                .skip(1)                       //13
                .limit(1)
                .forEach(e -> System.out.println(e));


    }
}
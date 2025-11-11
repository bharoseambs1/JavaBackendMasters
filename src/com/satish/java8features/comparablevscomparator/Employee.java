package com.satish.java8features.comparablevscomparator;

class Employee {
    String name;
    double salary;
    String city;

    public Employee(String name, double salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
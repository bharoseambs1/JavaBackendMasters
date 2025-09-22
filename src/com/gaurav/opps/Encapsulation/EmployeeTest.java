package com.gaurav.opps.Encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(17, "Gaurav", 100000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());


        emp.setName("Gaurav Jadhav");
        System.out.println("Updated Name: " + emp.getName());
    }
}

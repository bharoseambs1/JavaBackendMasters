package com.sneha.inheritance;

import com.sneha.inheritance.Employee;

public class Manager extends Employee {
    double bonus;

    Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }
    void displayTotalCompensation() {
        super.displaySalary();
        System.out.println("Bonus: " + bonus);
    }



    public static void main(String[] args) {
        Manager mgr = new Manager(5000, 10000);
        mgr.displayTotalCompensation();
    }
}

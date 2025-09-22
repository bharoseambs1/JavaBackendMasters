package com.gaurav.opps.inheritance;

public class Manager extends Employee {
    double bonus;

    public Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

void displaySalary(){
        double salary = super.salary + bonus;
        System.out.println(salary);
}

    public static void main(String[] args) {
        Manager m = new Manager(10000.0, 2000);
        m.displaySalary();
    }




}

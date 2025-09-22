package com.gaurav.opps.Encapsulation;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("age always positive number");
        }
    }

    public void displayStudentDetails() {
        System.out.println("name " + name + " " + "age " + age);
    }

    public static void main(String[] args) {
        Student std = new Student("Gaurav ", 29);
        std.displayStudentDetails();
    }
}

package com.sneha.inheritance;

public class Student extends Person {
    int studentId;
    String course;


    public Student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;

    }

    public static void main(String[] args) {
        Student std = new Student("Sneha", 25, 17,"java");
        std.Display();
    }
    void Display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(studentId);
        System.out.println(course);
    }



}



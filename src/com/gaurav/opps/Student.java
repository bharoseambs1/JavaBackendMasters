package com.gaurav.opps;

public class Student extends Person{
    int studentId;
    String course;

    public Student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    void displayStudent(){
        System.out.println(studentId);
        System.out.println(course);
    }
}

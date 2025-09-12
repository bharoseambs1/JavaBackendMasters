package com.prajakta.singleinheritance;

public class Student extends Person {
    String studId;
    String course1;

    Student(String nm, int age1, String studId, String course1) {
        this.nm=nm;
        this.age1=age1;
        this.studId = studId;
        this.course1 = course1;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Student ID: " + studId);
        System.out.println("Course: " + course1);
    }
    public static void main(String[] args) {
        Student s1 = new Student("ABC", 12, "B224", "Computer Science");
        s1.displayStudent();
    }
}

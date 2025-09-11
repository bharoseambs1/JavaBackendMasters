package com.shradha.Inheritance;
//Single Inheritance: Create a class Person with attributes name and age.
// Create a subclass Student that extends Person and adds studentId and course.
// Write a program to create a Student object and display all details
public class Person {

    String name;
    int age;

    // Constructor
    Person() {

    }

    // Method to display details
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class (Single Inheritance)
class Student extends Person {
    String studentId;
    String course;

    // Constructor
    Student(String name, int age, String studentId, String course) {
        //super(name, age); // Call parent constructor
       this.name=name;
       this.age=age;
       this.studentId = studentId;
       this.course = course;
    }

    // Method to display student details
    void displayStudent() {
        displayPerson(); // Reuse parent method
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student("XYZ", 18, "S101", "Computer Science");

        // Display all details
        s1.displayStudent();
    }
}

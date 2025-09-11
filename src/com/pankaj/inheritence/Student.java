package com.pankaj.inheritence;

import org.w3c.dom.ls.LSOutput;

public class Student extends Person{
    int StudentId;
    String course;
    public Student(String name, int age, int studentId, String course) {
        super(name, age);
        this.StudentId = studentId;
        this.course = course;
    }

    public static void main(String[] args) {
        Student stuObj=new Student("Pankaj",24,101,"Java");
        System.out.println(stuObj.name);
        System.out.println(stuObj.age);
        System.out.println(stuObj.StudentId);
        System.out.println(stuObj.course);

    }


}

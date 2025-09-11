package com.pankaj.inheritence;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

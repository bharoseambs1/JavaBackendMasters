package com.gaurav.opps.inheritance;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson(){
        System.out.println(name);
        System.out.println(age);
    }
}

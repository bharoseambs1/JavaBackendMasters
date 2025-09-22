package com.prajakta.encapsulation;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
            System.out.println("positive number");
        }
    }

    public void displayPersonDetails() {
        System.out.println("name " + name + " " + "age " + age);
    }

    public static void main(String[] args) {
        Person  per = new Person("ABC ", 50);
        per.displayPersonDetails();
    }
}


package com.satish.java8features;

public class Player {
    /*{	{101, "Sachin", 26, "Mumbai"},
        {102, "Saurabh", 29, "Kolkata"},
        {103, "Rohit", 28, "Mumbai"},
        {104, "Laxman", 28, "Hyderabad"},
        {105, "MS Dhoni", 28, "Chennai"}}*/
    int id;
    String name;
    int age;
    String city;

    public Player(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

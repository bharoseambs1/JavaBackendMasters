package com.prajakta.java8features;

//Problem: Sort Person {name, age, city} by city, then age.


class Person {
    String name;
    int age;
    String city;

    Person(String n,int a,String c){
        name=n;
        age=a;
        city=c;
    }
    @Override public String toString(){
        return name + "(" + age + "," + city + ")";
    }
}

package com.prajakta.java8features.comparablevscomparator;

//Comparator.comparing and thenComparing — sort by multiple fields
       // Problem: Sort Person {name, age, city} by city, then age.

import java.util.*;

class Person {
    String name; int age; String city;
    Person(String n,int a,String c){name=n;age=a;city=c;}
    @Override public String toString(){ return name + "(" + age + "," + city + ")"; }
}

/*Step-by-step
1. Comparator.comparing accepts a key extractor.
2. thenComparing chains tie-breakers.
3. thenComparingInt avoids boxing for int keys.*/

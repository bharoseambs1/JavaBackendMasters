package com.prajakta.java8features.comparablevscomparator;

//Comparator pre-Java8 (anonymous class)
//Problem: Sort Employee by salary using an anonymous Comparator.

import java.util.*;

class Employee {
    String name;
    double salary;
    Employee(String n, double s){ name=n; salary=s; }
    @Override public String toString(){ return name + ":" + salary; }
}

/*Step-by-step
1. Provide an anonymous Comparator<Employee> to Collections.sort.
2. Use Double.compare to correctly handle double comparisons.*/
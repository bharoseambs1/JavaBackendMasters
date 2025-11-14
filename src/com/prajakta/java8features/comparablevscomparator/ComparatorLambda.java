package com.prajakta.java8features.comparablevscomparator;

//Comparator using Java 8 lambda
// Problem: Same salary sort but with lambda and List.sort.

import java.util.*;

public class ComparatorLambda {
    static class Employee {
        String name; double salary;
        Employee(String n, double s){ name=n; salary=s; }
        @Override public String toString(){ return name + ":" + salary; }
    }
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 90000)
        );
        // Java 8: lambda
        list.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println(list);

        // even shorter using Comparator.comparingDouble
        list.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println(list);
    }
}
/*Step-by-step
1. list.sort(Comparator) is Java 8 addition — more fluent than Collections.sort.
2. Lambdas make comparator concise.
3. Comparator.comparingDouble avoids boxing and is clearer.*/
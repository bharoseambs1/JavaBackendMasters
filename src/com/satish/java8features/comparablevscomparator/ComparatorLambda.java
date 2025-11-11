package com.satish.java8features.comparablevscomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", 70000, "Pune"),
                new Employee("Bob Sen", 50000, "Pune"),
                new Employee("Bob Men", 45000, "Pune"),
                new Employee("Danny", 90000, "Pune"),
                new Employee("Charlie", 20000, "Mumbai")
        );

        /*// Java 8: lambda
        list.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println(list);

        // even shorter using Comparator.comparingDouble
        list.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println(list);*/

        list.stream()
                .filter(emp -> emp.city.equalsIgnoreCase("pune"))
                .sorted(Comparator.comparingDouble(emp -> emp.salary))
                .forEach(System.out::println);


    }
}
/*
package com.satish.java8features.comparablevscomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPreJava8 {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Danny", 90000),
                new Employee("Charlie", 20000)
        );

        Comparator comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
                */
/*if (e1.name == e2.name) {
                    return 0;
                }
                if (e1.name == null) {
                    return -1;
                }
                if (e2.name == null) {
                    return 1;
                }
                return e1.name.compareTo(e2.name);*//*

            }
        };

        Collections.sort(list, comparator);

        System.out.println(list);
    }

}
*/

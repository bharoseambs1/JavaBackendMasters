package com.prajakta.java8features;

import java.util.*;

public class MultiFieldSort {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "London"),
                new Person("Bob", 25, "Paris"),
                new Person("Carl", 28, "London"),
                new Person("Dana", 22, "Paris")
        );

        Comparator<Person> cmp = Comparator
                .comparing((Person p) -> p.city)                // compare by city
                .thenComparingInt(p -> p.age);           // then compare by age

        people.sort(cmp);
        System.out.println(people);
    }
}
/*Step-by-step
1. Comparator.comparing accepts a key extractor.
2. thenComparing chains tie-breakers.
3. thenComparingInt avoids boxing for int keys.*/
package com.prajakta.java8features.comparablevscomparator;

//Comparable — basic (pre-Java8)

import java.util.*;

public class PersonComparable implements Comparable<PersonComparable> {
    String name;
    int age;
    public PersonComparable(String name, int age) { this.name = name; this.age = age; }
    @Override
    public int compareTo(PersonComparable other) {
        // natural order: increasing age
        return Integer.compare(this.age, other.age);
    }
    @Override
    public String toString() { return name + "(" + age + ")"; }

    public static void main(String[] args) {
        List<PersonComparable> ppl = Arrays.asList(
                new PersonComparable("Alice", 34),
                new PersonComparable("Bob", 25),
                new PersonComparable("Charlie", 30)
        );
        Collections.sort(ppl); // uses compareTo
        System.out.println(ppl);
    }
}
/*Step-by-step
1. Implement Comparable<T> and override compareTo.
2. Use Integer.compare (handles overflow better than this.age - other.age).
        3. Collections.sort(list) calls compareTo for comparisons.*/
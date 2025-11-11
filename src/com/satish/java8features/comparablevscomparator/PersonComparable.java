package com.satish.java8features.comparablevscomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
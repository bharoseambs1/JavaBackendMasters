package com.prajakta.java8features.comparablevscomparator;

//Comparable with TreeSet and Arrays.sort

import java.util.*;

public class ComparableExamples {
    public static void main(String[] args) {
        PersonComparable p1 = new PersonComparable("A", 20);
        PersonComparable p2 = new PersonComparable("B", 18);
        PersonComparable p3 = new PersonComparable("C", 22);

        TreeSet<PersonComparable> set = new TreeSet<>(); // uses natural order
        set.add(p1); set.add(p2); set.add(p3);
        System.out.println("TreeSet (sorted by age): " + set);

        PersonComparable[] arr = {p3, p1, p2};
        Arrays.sort(arr); // uses compareTo
        System.out.println("Array sorted: " + Arrays.toString(arr));
    }
}
/*Notes
 TreeSet relies on ordering; if two elements compare as 0, only one may be kept.
 If compareTo is inconsistent with equals, TreeSet/TreeMap may behave unexpectedly.*/
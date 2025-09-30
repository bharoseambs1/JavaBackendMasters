package com.gaurav.collections.map;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {// maintains insertion order
        // allows null
        // no duplicates
        // not synchronized
        // underlying data structure is a hash table and a linked list
        // better performance than HashSet for iteration
        // slightly slower than HashSet for add, remove, contains operations
        // use when you need to maintain insertion order and have fast access
        // use HashSet when you don't care about order and need maximum performance
        // use TreeSet when you need sorted order

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored
        set.add(null);
        System.out.println("LinkedHashSet: " + set);
    }
}

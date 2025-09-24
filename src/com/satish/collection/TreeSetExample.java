package com.satish.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {   // sorted order
        // no null allowed
        // no duplicates
        // not synchronized
        // underlying data structure is a red-black tree
        // slower than HashSet and LinkedHashSet for add, remove, contains operations
        // use when you need sorted order
        // use HashSet when you don't care about order and need maximum performance
        // use LinkedHashSet when you need to maintain insertion order and have fast access
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(30); // duplicate ignored
        System.out.println("TreeSet: " + set);
    }
}
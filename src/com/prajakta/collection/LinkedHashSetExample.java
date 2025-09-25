package com.prajakta.collection;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
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


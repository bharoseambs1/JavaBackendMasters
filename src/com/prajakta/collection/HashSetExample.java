package com.prajakta.collection;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored
        set.add(null);
        System.out.println("HashSet: " + set);
    }
}


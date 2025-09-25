package com.prajakta.collection;

import java.util.Set;
import java.util.HashSet;

public class SetEg1 {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("Australia");
        countries.add("Canada");
        System.out.println("Countries: " + countries);
    }
}

package com.pankaj.collection;

import java.util.*;
public class SetExample1 {
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
package com.gaurav.array;

import java.util.HashSet;
import java.util.Set;

public class CreateAndDisplaySet {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("india");
        countries.add("USA");
        countries.add("UAE");
        countries.add("uk");
        System.out.println(countries); // set not maintain insersation order
    }
}

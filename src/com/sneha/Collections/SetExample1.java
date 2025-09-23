package com.sneha.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Uk");
        countries.add("Austrilia");
        countries.add("Australia");
        countries.add("Canada");
        System.out.println("countries:" + countries);
    }

}

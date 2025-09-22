package com.pankaj.collection;

import java.util.*;
public class ListExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Mango"));
        if (names.contains("Apple")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
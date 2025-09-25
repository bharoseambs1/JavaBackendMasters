package com.prajakta.collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListCollections3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Satish", "Amit", "Priya", "Rohit", "Neha")); System.out.println("Original List :-"+names);
        Collections.shuffle(names);
        System.out.println("Shuffled List: " + names);
    }
}


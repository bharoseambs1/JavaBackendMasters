package com.pankaj.collection;

import java.util.*;
public class ListExample5 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("Ram", "Shyam", "Geeta", "Sita", "Mohan"));
        Collections.reverse(students);
        System.out.println("Reversed List: " + students);
    }
}
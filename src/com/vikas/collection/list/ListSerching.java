package com.vikas.collection.list;

import java.util.Arrays;
import java.util.List;

public class ListSerching {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Kiwi", "Mango");

        if (names.contains("Apple")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
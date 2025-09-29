package com.sneha.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Mango"));
        if (names.contains("Apple")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}

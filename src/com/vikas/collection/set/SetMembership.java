package com.vikas.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMembership {

    public static void main(String[] args) {
        Set<String> colors =new HashSet<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        if (colors.contains("Blue")) {
            System.out.println("Blue is present.");
        } else {
            System.out.println("Blue is not present.");
        }
    }
}
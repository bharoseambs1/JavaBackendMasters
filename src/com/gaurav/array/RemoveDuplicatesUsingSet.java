package com.gaurav.array;

import com.satish.oopsconcept.I;

import java.util.*;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,3,4,5,6,2);
        Set<Integer> unique = new HashSet<>(numbers);
        System.out.println(unique);
    }
}

package com.sneha.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample2 {
    public static void main(String[]args) {
        List<Integer> List = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> unique = new HashSet<>(List);
        System.out.println("Unique Numbers : " + unique);
    }
}

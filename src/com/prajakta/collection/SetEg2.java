package com.prajakta.collection;
import java.util.*;
public class SetEg2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> unique = new HashSet<>(list);
        System.out.println("Unique Numbers: " + unique);
    }
}

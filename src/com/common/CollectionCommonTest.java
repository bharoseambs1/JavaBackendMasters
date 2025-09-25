package com.common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionCommonTest {
    public static void main(String[] args) {

        //Vedansh - code starts here
        HashSet<String> set = new HashSet<>(Arrays.asList("Apple","Banana","Apple","Mango"));
        TreeSet<String> sorted = new TreeSet<>(set); // sorting
        System.out.println("Sorted Set: " + sorted);
        System.out.println("Count: " + set.size());
        //Vedansh - code ends here

    }
}

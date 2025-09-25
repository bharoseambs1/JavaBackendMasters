package com.common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionCommonTest {
    public static void main(String[] args) {

        //Satish - code starts here
        //Vedansh - code starts here
        //Gaurav - code starts here
        //Sneha - code starts here
        HashSet<String> set = new HashSet<>(Arrays.asList("Apple","Banana","Apple","Mango"));
        TreeSet<String> sorted = new TreeSet<>(set); // sorting
        System.out.println("Sorted Set: " + sorted);
        System.out.println("Count: " + set.size());
        //Satish - code ends here
        //Vedansh - code ends here
        //Gaurav - code ends here
        //Sneha- code ends here
    }
}
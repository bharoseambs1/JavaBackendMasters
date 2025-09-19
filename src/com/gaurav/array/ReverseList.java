package com.gaurav.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("Gaurav", "sneha", "Aarav", "puja", "Sita"));
        Collections.reverse(students);
        System.out.println(students);
    }
}

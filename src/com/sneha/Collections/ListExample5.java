package com.sneha.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample5 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("Ram","shyam","Geeta", "Sita", "mohan"));
                Collections.reverse(students);
        System.out.println("Reversed list: " + students);
    }
}

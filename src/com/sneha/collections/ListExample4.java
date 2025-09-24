package com.sneha.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(45, 12, 78, 34, 2));
        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}

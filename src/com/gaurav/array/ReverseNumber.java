package com.gaurav.array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 15, 20, 42, 35, 1, 100));
        Collections.sort(numbers);
        System.out.println("Ascending " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("decending " + numbers);

    }
}

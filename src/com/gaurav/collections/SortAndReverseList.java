package com.gaurav.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(20,30,40,10,50));
        System.out.println("List original : " +list);
        //ascending order
        Collections.sort(list);
        System.out.println("Ascending order " + list);

        //decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("decending order " + list);

        // Reverse
        Collections.reverse(list);
        System.out.println("Reverse list " + list);

    }
}

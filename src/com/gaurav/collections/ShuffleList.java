package com.gaurav.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Gaurav", "neha", "jadhav", "Aarav"));
        System.out.println("original list: " + list);

        Collections.shuffle(list);
        System.out.println("shuffle list :" + list);
    }
}

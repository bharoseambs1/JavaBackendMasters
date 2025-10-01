package com.gaurav.collections.map;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Banana", "Yellow");
        map.put("Apple", "Red");
        map.put("Mango", "Orange");
        System.out.println(map); // Output: {Apple=Red, Banana=Yellow, Mango=Orange}
    }
}
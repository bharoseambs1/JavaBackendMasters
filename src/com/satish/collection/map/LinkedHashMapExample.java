package com.satish.collection.map;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        System.out.println(map); // Output: {A=100, B=200, C=300}
    }
}
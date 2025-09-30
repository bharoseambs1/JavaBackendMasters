package com.satish.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
    }
}
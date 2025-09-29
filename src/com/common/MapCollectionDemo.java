package com.common;

import java.util.*;

public class MapCollectionDemo {
    public static void main(String[] args) {
        //Vikas: Start coding from here
        // 1. Storing data in HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Mango");
        map.put(2, "Orange");
        map.put(10, null);
        map.put(11, null);
        map.put(null, null);
        map.put(null, null);
        map.put(null, "mango");
        System.out.println("Original Map: " + map);

        // 2. Searching in Map
        int searchKey = 2;
        if (map.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " found with value: " + map.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " not found.");
        }

        // 3. Sorting Map by Keys using TreeMap
//        Map<Integer, String> sortedByKey = new TreeMap<>(map);
//        System.out.println("Sorted by Key: " + sortedByKey);

        Map<Integer, String> sortedByKey1 = new TreeMap<>();
        map.entrySet().stream()
                .filter(e -> e.getKey() != null)   // exclude null keys
                .forEach(e -> sortedByKey1.put(e.getKey(), e.getValue()));

        System.out.println("Sorted by Key: " + sortedByKey1);

        // 4. Sorting Map by Values
//        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//        System.out.println("Sorted by Value: " + list);

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(
                Comparator.nullsLast(String::compareTo)   // handles nulls safely
        ));
        System.out.println("Sorted by Value: " + list);

        // 5. Manipulation - Update value
        map.put(2, "Grapes"); // Replaces "Orange"
        System.out.println("After Updating Key 2: " + map);

        // 6. Manipulation - Remove entry
        map.remove(3);
        System.out.println("After Removing Key 3: " + map);

        // 7. Iterating using for-each
        System.out.println("Iterating through Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());

            System.out.println("Using forEach + Lambda:");
            map.forEach((key, value) -> System.out.println(key + " => " + value));
        }
        //Vikas: Start coding from here


    }
}
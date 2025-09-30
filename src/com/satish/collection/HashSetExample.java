package com.satish.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored
        set.add(null);
        System.out.println("HashSet: " + set);

        Map<String, String> map = new HashMap<>();
        map.put("1", "Java");
        map.put("2", "Python");
        map.put("3", "C++");
        map.put("1", "JavaScript"); // duplicate key, value updated
        map.put(null, "NullKey");
        System.out.println("HashMap: " + map);
    }
}
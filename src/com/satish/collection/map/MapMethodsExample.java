package com.satish.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethodsExample {
    public static void main(String[] args) {
        //Map<Integer, String> mapStr = new HashMap<>();  //no order maintained
        //Map<Integer, String> mapStr = new LinkedHashMap<>();  //insertion order maintained
        /*Map<Integer, String> map = new TreeMap<>();  //no order maintained
        map.put(101, "Java");
        map.put(110, "C++");
        map.put(102, "Python");
        map.put(103, "C++");
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());*/

        Map<String, String> mapStr = new TreeMap<>();  //no order maintained
        mapStr.put("Sachin", "Java");
        mapStr.put("Ganesh", "C++");
        mapStr.put("Mahesh", "Python");
        mapStr.put("Anil", "C++");      //Anil, Ganesh, Mahesh, Sachin
        System.out.println("Keys: " + mapStr.keySet());
        System.out.println("Values: " + mapStr.values());
        System.out.println("Entries: " + mapStr.entrySet());
    }
}
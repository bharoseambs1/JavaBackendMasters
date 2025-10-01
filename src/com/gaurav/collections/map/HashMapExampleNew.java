package com.gaurav.collections.map;


import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMapExampleNew {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
            map.put(2, "Banana");
            map.put(3, "Mango");
            System.out.println("Value for key 2: " + map.get(2));
            System.out.println(map);
            System.out.println(map.containsKey(3)); //true
            System.out.println(map.containsKey(4)); //false
            System.out.println(map.containsValue("Banana")); //true
            System.out.println(map.containsValue("Orange")); //false


        /*Set<String> stringSet = new HashSet<>();
        stringSet.add("One");
        stringSet.add("Two");
        stringSet.add("Three");

        for(String str : stringSet){
            System.out.println(str);
        }

        Set<Map.Entry<Integer, String>> entrySetttt = map.entrySet();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);

        for(Integer integer : integerList){
            System.out.println(integer);
        }*/



        /*Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());*/

        /*TreeMapExample obj = new TreeMapExample();
        obj.*/
        }
    }
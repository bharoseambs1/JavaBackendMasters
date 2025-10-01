package com.gaurav.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Java");
        hashMap.put(2,"Python");
        hashMap.put(3,"C++");
        hashMap.put(2,"Python Updated"); //duplicate key not allowed
        hashMap.put(null,"Null Key"); //null key allowed
        hashMap.put(4,null); //null value allowed
        hashMap.put(5,null); //null value allowed
        System.out.println("HashMap: " + hashMap);

        System.out.println("Value for key 3: " + hashMap.get(3));

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

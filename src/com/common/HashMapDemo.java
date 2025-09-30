package com.common;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Map<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");  //101: hc
        hashMap.put(2, "Two");  //102: hc
        hashMap.put(2, "Two Updated");  //102  hashcode(102,102) and equals(it will check the content of a Key::2,4)
        hashMap.put(3, "Three");

        hashMap.put(4, "Four");  //102--102 hash collusion occured   --> 2.equals(4)-->false
                //to resolve the hash collusion java uses LinkedList or Balanced Tree
        hashMap.put(4, "Four Updated"); //102--102 hash collusion occured   --> 2.equals(4)-->false
        hashMap.put(null, "Null Key"); // HashMap allows one null key
        hashMap.put(5, null); // HashMap allows multiple null values
        hashMap.put(6, null); // HashMap allows multiple null values

        System.out.println("HashMap: " + hashMap);

        System.out.println(hashMap.get(3)); // Output: Three

        //Map.Entry entrySet = (Map.Entry) hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }




    }
}
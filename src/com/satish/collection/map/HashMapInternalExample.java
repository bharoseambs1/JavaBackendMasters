package com.satish.collection.map;

import java.util.*; public class HashMapInternalExample {
    public static void main(String[] args) {


        String str1 = "Mango"; //String literal  string constant pool  100  objects:heap memory  Mango:300(str1, str3)  Banana:400(str4)
        String str2 = new String("Mango");  //always create new object in heap memory
        String str3 = "Mango";
        String str4 = "Banana";

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //address check  false
        System.out.println(str1 == str3); //address check  true
        System.out.println(str3 == str4);   //false
        System.out.println(str3.equals(str4));  //false

        HashMap map = new HashMap<>(); // put() operatio
        map.put("Apple", 100);          //2
        map.put("Banana", 200);         //3
        map.put("Mango", 300);          //1   updated by value 600
        map.put("Orange", 400);         // get() operation   //1
        map.put("Mango", 600);          //                  //1
        map.put("Pineapple", 600);     //                  //1
        map.put("Orange", 800);       //                    //1

        System.out.println("Value for Mango: " + map.get("Mango"));
    }
}

/*
Internal Flow for put("Mango", 300):
        • "Mango".hashCode() is calculated.   -- 1001
        • Hash is processed → bucket index is computed. -- index 1
        • Check if a node exists at that index:
        • - If empty → place new node.
• - If key exists → update value.
        • - If different key but same index → collision → add to linked list/tree.*/

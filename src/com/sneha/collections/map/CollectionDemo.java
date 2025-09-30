package com.sneha.collections.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List: " + list);
        System.out.println("list size" + list.size());

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> strV = new Vector<>();
        strV.add("AV");
        System.out.println("vector size" + strV.size());
    }
}

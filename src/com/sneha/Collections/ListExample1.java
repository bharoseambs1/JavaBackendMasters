package com.sneha.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");
        System.out.println("Fruits list;");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

package com.gaurav.array;

import java.util.ArrayList;
import java.util.List;
public class  CreateAndDisplayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("mango");
        list.add("bananna");
        System.out.println("Fruits list : ");
        for(String lits : list){
            System.out.println(lits);
        }
    }
}

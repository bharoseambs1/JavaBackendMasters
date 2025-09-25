package com.gaurav.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("apple", "bananna","mango"));
        if(names.contains("apple")){
            System.out.println("FOund");
        }else {
            System.out.println("not found");
        }
    }
}

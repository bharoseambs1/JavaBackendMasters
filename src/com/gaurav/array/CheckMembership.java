package com.gaurav.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckMembership {
    public static void main(String[] args) {
        Set<String> clr = new HashSet<>(Arrays.asList("Blue", "red", "yellow", "Green"));
        if (clr.contains("Blue")){
            System.out.println("is present");
        }else {
            System.out.println("blue not present");
        }
    }
}

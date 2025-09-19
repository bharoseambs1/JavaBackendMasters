package com.gaurav.array;

import java.util.ArrayList;
import java.util.List;

public class InsertAndRemoveElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i=1; i<=10;i++){
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5));
        numbers.add(2, 99);
        System.out.println("updated list :" + numbers);
    }
}

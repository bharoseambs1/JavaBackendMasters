package com.sneha.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5)); // remove 5
        numbers.add(2, 99);                    //insert 99 at 3rd position (index 2)
        System.out.println("Update List: " + numbers);
    }
}



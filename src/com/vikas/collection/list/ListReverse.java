package com.vikas.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse {

        public static void main(String[] args) {
            List<String> students =
                    Arrays.asList("Ram", "Shyam", "Geeta", "Sita","Mohan");

                            Collections.reverse(students);
                    System.out.println("Reversed List: " + students);
        }
    }
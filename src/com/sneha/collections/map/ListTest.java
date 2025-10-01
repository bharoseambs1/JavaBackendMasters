package com.sneha.collections.map;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

        List<String> strLst = new ArrayList<>();
        strLst.add("Z");
        strLst.add("A");
        strLst.add("B");
        strLst.add("C");
        System.out.println("Before Sorting:");

        for (String str : strLst) {
            System.out.println(str);
        }
        Collections.sort(strLst);

        System.out.println("After Sorting:");
        for (String str : strLst) {
            System.out.println(str);
        }


        System.out.println("strLst.get(0): " + strLst.get(0));

        Set<String> strSet = new HashSet<>();
        strSet.add("A");
        strSet.add("B");
        strSet.add("C");

        System.out.println("strSet.get(0): " + strSet.contains("A"));

        for (String str : strLst) {
            System.out.println(str);
        }

        List<Integer> numberLst = new ArrayList<>();
        numberLst.add(10);
        numberLst.add(20);
        numberLst.add(30);
        numberLst.add(40);
        numberLst.add(80);
        //int Integer
        for (Integer number : numberLst) {
            System.out.println(number);
        }

        List<Student> studentLst = new ArrayList<>();
        studentLst.add(new Student(1, "Satish", 30));
        studentLst.add(new Student(3, "Reddy", 32));
        studentLst.add(new Student(2, "Kumar", 28));
        studentLst.add(new Student(4, "Akshay", 32));

        for (Student student : studentLst) {
            System.out.println(student.id + " " + student.name + " " + student.age);
        }


        Collections.sort(studentLst, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println("After Sorting:");
        for (Student student : studentLst) {
            System.out.println(student.id + " " + student.name + " " + student.age);

        }
    }
}
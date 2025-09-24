package com.satish.collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List newList = new ArrayList();

        List list = new ArrayList();
        list.add("Sachin");
        list.add(123);
        list.add(123);
        list.add(false);

        System.out.println(list);
        System.out.println("#########Set###########");
        Set set = new HashSet();
        set.add("Sachin");
        set.add(123);
        set.add(123);
        set.add(false);

        System.out.println(set);



        /*Collections.copy(newList, list);

        System.out.println("New list after copy: " + newList);*/

        List<String> src = Arrays.asList("a", "b", "c");
        List<String> dest = new ArrayList<>(Collections.nCopies(src.size(), ""));
        System.out.println("New list before copy: " + dest);
        Collections.copy(dest, src);

        List<Integer> intLst = List.of(10, 20, 30, 100, 200, 50);


        System.out.println("Max number from list: " + Collections.max(intLst));  //200


        System.out.println("New list after copy: " + dest);
    }
}

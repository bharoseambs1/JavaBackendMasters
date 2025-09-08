package com.satish.staticconcept;

public class StaticVariableTest {
    public static int i = 10;  //only one copy of i get created bcos it's static i=10,20
    public int j = 10;        //number of copies get created with respect to objects j=10

    //Student 1000,
    //static String collegeName;

    public static void main(String[] args) {
        StaticVariableTest obj1 = new StaticVariableTest();
        StaticVariableTest obj2 = new StaticVariableTest();
        obj1.i = 20;                                     //obj1.i = 20

        System.out.println(obj1.i);  //20
        System.out.println(obj2.i);  //20
        System.out.println("##########################################");
        obj1.j = 20;
        System.out.println(obj1.j);  //obj1 = 20
        System.out.println(obj2.j);  //obj2 = 10

    }

    static class sample{

    }

}
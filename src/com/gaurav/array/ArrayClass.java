package com.gaurav.array;

public class ArrayClass {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
       try {
           System.out.println(arr[-1]);
       }catch (Exception e){
           System.out.println(e);
       }
        System.out.println(arr[3]);
    }

}

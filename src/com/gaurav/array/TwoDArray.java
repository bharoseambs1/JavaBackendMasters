package com.gaurav.array;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr2d = {{1,2,3}
                        ,{4,5,6}};

        System.out.println(arr2d.length);
        for(int x = 0; x < arr2d.length; x++){
            for (int y = 0; y <= arr2d.length; y++){
                System.out.print(arr2d[x][y] + " ");
            }
            System.out.println();
        }

    }
}

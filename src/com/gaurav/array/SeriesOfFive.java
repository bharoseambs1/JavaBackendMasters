package com.gaurav.array;
public class SeriesOfFive {
    public static void main(String[] args) {
        int[] seriesOfFive = new int[10];
        for(int i =0; i<10; i++){
            seriesOfFive[i] = 5 *(i+1);
        }
        for(int num :seriesOfFive){
            System.out.println(num);
        }
    }
}

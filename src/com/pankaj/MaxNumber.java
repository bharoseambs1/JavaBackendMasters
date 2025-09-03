package com.pankaj;

public class MaxNumber {

    public int findMaxNum(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static void main(String[] args) {
        MaxNumber maxNum = new MaxNumber();
        int maxNumwer = maxNum.findMaxNum(20,30);
        System.out.println(maxNumwer);
    }
}
package com.satish.exceptionhandling;

public class TryCatchWithFinally {
    public static void main(String[] args) {
        System.out.println("line 1 message");
        System.out.println("line 2 message");
        System.out.println("line 3 message");
        System.out.println("line 4 message");
        System.out.println("line 5 message");
        System.out.println("line 6 message");
        /*try {
            System.out.println(10 / 2);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }finally {  // finally block is always executed if exception occurs or not
            System.out.println("Message from finally block");
        }*/
        String s1 = null;
        int[] arr = {10,20,30};
        try{
            //System.out.println(s1.length()); //nullPointerException
            arr[5] = 20; // ArrayIndexOutOfBoundsException
        }catch (NullPointerException | ArrayIndexOutOfBoundsException na){
            System.out.println(na.getMessage());
            System.exit(0);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Message from finally block");
        }

        System.out.println("line 7 message");
        System.out.println("line 8 message");
        System.out.println("line 9 message");
        System.out.println("line 10 message");
        System.out.println("line 11 message");
        System.out.println("line 12 message");
        System.out.println("line 13 message");
        System.out.println("line 14 message");
        System.out.println("line 15 message");
    }
}
package com.satish.exceptionhandling;

public class CustomExceptionTest {
    public static void main(String[] args) throws InvalidAgeException {
     checkAge(15);
    }

    private static void checkAge(int i) throws InvalidAgeException{ //21    15
        if(i<18){  //false   true
            try {
                throw new InvalidAgeException("Age is less than 18");
                //throw keyword is used to throw an exception explicitly
            } catch (InvalidAgeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }else{
            System.out.println("Age is valid");  //Age is valid
        }
    }
}
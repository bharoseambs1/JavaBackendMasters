package com.satish.exceptionhandling;

public class InvalidAgeException extends Exception{
    //if age is less than 18 then it will throw an exception InvalidAgeException if 18 or more than 18 then fine
    public InvalidAgeException(String message){//Age is less than 18
        super(message);//Age is less than 18
    }
}
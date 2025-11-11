package com.satish.java8features.comparablevscomparator;

public interface ABC {
    void showMessage();
    String getMessage();

    default String editMessageDefault(String str){
        return "Edited: " + str;
    }

    static String editMessageStatic(String str){
        return "Edited: " + str;
    }
}
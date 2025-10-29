package com.satish.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class Child extends Parent {
    void show() throws ArrayIndexOutOfBoundsException {
        System.out.println("Child method");
    }
}
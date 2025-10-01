package com.sneha.collections.map;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) { //LIFO: last in first out
                                             //push(), pop(), peek()
        Stack<String> stack = new Stack<>();
        stack.push("Java");  //1st element
        stack.push("Python"); //2nd element
        stack.push("C++"); //3rd element
        System.out.println("Stack: " + stack);  //Java, Python, C++
        System.out.println("Top element (peek): " + stack.peek());  //C++
        System.out.println("Popped element: " + stack.pop());  //C++
        System.out.println("Stack after pop: " + stack);  //Java Python
    }
}
package com.prajakta.collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

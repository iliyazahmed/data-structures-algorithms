package com.tns.ListInterface;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(); //Last in First Out (LIFO)
        integerStack.push(12);
        integerStack.push(42);
        integerStack.push(19);
        integerStack.push(78);
        System.out.println("Last Element    : "+integerStack.peek()); //peek will print last element
        System.out.println("Size of stack   : "+integerStack.size());
        System.out.println("Removed Element : "+integerStack.pop()); // pop will remove last element
        System.out.println("Size of stack   : "+integerStack.size());
        System.out.println("Last Element    : "+integerStack.peek());
        System.out.println("Removed Element : "+integerStack.pop());
        System.out.println("Size of stack   : "+integerStack.size());
        System.out.println("Last Element    : "+integerStack.peek());

    }
}

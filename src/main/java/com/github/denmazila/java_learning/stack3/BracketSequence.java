package com.github.denmazila.java_learning.stack3;

import java.util.Scanner;

public class BracketSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скобочную последовательность: ");
        String bracketSequence = (in.next());
        char[] bracketArray = bracketSequence.toCharArray();
        int length = bracketArray.length;
        MyStack stack = new MyStack(length);

        stackСreation(bracketArray, stack);

        if (bracketSequenceCheck(length, stack)){
            System.out.println("скобочная последовательность верная");
        }
        else {
            System.out.println("скобочная последовательность не верная");
        }
    }

    public static void stackСreation(char[] bracketArray, MyStack stack) {
        for (char value : bracketArray) {
            stack.push(value);
        }
    }

    public static boolean bracketSequenceCheck(int length, MyStack stack) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < length; i++) {
            if (stack.pop() == ')') {
                close++;
            } else {
                open++;
            }
            if ((close - open) < 0) {
                return false;
            }
        }
        return (close - open) == 0;
    }
}

package com.github.denmazila.java_learning.stack3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скобочную последовательность: ");
        String bracketSequence = (in.next());
        char[] bracketArray = bracketSequence.toCharArray();
        int length = bracketArray.length;
        MyStack stack = new MyStack(length);

        for (int i = 0; i < length; i++) {
            char value = bracketArray[i];
            stack.push(value);
        }

        int open = 0;
        int close = 0;
        for (int i = 0; i < length; i++) {
            if (stack.pop() == ')') {
                close++;
            } else {
                open++;
            }
            if ((close - open) < 0) {
                System.out.println("скобочная последовательность не верная");
                return;
            }
        }
        if ((close - open) == 0) {
            System.out.println("скобочная последовательность верная");
        } else {
            System.out.println("скобочная последовательность не верная");
        }
    }
}

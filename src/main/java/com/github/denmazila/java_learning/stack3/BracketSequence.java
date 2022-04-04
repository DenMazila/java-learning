package com.github.denmazila.java_learning.stack3;

import java.util.Scanner;

public class BracketSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скобочную последовательность: ");
        // ()(()))
        /*String s = "()(())()";
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            int position = s.indexOf("()");
            if (position == -1) break;
            String temp = s.substring(0, position) + s.substring(position + 2);
            s = temp;
        }
        if (s.isEmpty()) System.out.println("скобочная последовательность верная");
        else System.out.println("скобочная последовательность не верная");
        if (true) throw new RuntimeException();*/

        String bracketSequence = (in.next());
        char[] bracketArray = bracketSequence.toCharArray();
        int length = bracketArray.length;
        MyStack stack = new MyStack(length);

        createStack(bracketArray, stack);

        if (checkBracketSequence(length, stack)) {
            System.out.println("скобочная последовательность верная");
        } else {
            System.out.println("скобочная последовательность не верная");
        }
    }

    public static void createStack(char[] bracketArray, MyStack stack) {
        for (char value : bracketArray) {
            stack.push(value);
        }
    }

    public static boolean checkBracketSequence(int length, MyStack stack) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < length; i++) {
            if (stack.pop() == ')') {
                close++;
            } else {
                close--;
            }
            if (close < 0) {
                return false;
            }
        }
        return (close - open) == 0;
    }
}

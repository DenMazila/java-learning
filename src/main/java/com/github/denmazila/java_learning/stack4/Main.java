package com.github.denmazila.java_learning.stack4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скобочную последовательность: ");
        String bracketSequence = in.next();
        char[] bracketArray = bracketSequence.toCharArray();
        if (checkBracketSequence(bracketArray.length, bracketArray)) {
            System.out.println("скобочная последовательность верная");
        } else {
            System.out.println("скобочная последовательность не верная");
        }
    }

    public static boolean checkBracketSequence(int length, char[] bracketArray) {
        MyStack stack = new MyStack(bracketArray.length);
        if (bracketArray[0] == ')' || bracketArray[0] == ']' || length % 2 != 0) {
            return false;
        } else {
            stack.push(bracketArray[0]);
        }
        char peek;
        for (int i = 1; i < length; i++) {
            peek = stack.pop();
            if ((peek != '(' || bracketArray[i] != ')') && (peek != '[' || bracketArray[i] != ']')) {
                stack.push(peek);
                stack.push(bracketArray[i]);
            }
            if (i < length - 1 && stack.size() == 0) {
                stack.push(bracketArray[i + 1]);
                i++;
            }
        }
        return stack.empty();
    }

}

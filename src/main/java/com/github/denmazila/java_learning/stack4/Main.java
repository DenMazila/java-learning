package com.github.denmazila.java_learning.stack4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скобочную последовательность: ");
        String bracketSequence = (in.next());
        char[] bracketArray = bracketSequence.toCharArray();
        int length = bracketArray.length;
        MyStack stack = new MyStack(length);

        if (checkBracketSequence(length, stack, bracketArray)) {
            System.out.println("скобочная последовательность верная");
        } else {
            System.out.println("скобочная последовательность не верная");
        }
    }

    public static boolean checkBracketSequence(int length, MyStack stack, char bracketArray[]) {
        int stackCounter = 0;
        char peek;
        if (bracketArray[0] == ')' || bracketArray[0] == ']' || length % 2 != 0) {
            return false;
        } else {
            stack.push(bracketArray[0]);
            stackCounter++;
        }

        for (int i = 1; i < length; i++) {
            peek = stack.pop();
            stackCounter--;
            if ((peek == '(' && bracketArray[i] == ')') || (peek == '[' && bracketArray[i] == ']')) {
            } else {
                stack.push(peek);
                stackCounter++;
                stack.push(bracketArray[i]);
                stackCounter++;
            }
            if (i < length - 1 && stackCounter == 0) {
                stack.push(bracketArray[i + 1]);
                stackCounter++;
                i++;
            }

        }
        return stack.empty();
    }
}

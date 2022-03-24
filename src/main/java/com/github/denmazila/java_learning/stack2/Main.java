package com.github.denmazila.java_learning.stack2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bracketSequence = (in.next());
        char[] bracketArray = bracketSequence.toCharArray();
        int length = bracketArray.length;
        Stack<Character> stackBracketSequence = new Stack<>();

        for (int i = 0; i < length; i++) {
            stackBracketSequence.push(bracketArray[i]);
        }
        int open = 0;
        int close = 0;
        for (int i = 0; i < length; i++) {
            if (stackBracketSequence.pop() == ')') {
                close++;
            } else {
                open++;
            }
            if ((close - open) < 0) {
                System.out.println("скобочная последовательность не верная");
                return;
            }
        }
    }
}

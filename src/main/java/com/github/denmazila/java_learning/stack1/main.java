package com.github.denmazila.java_learning.stack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> charList = new ArrayList<>();
        String bracketSequence = (in.next());
        char[] bracketArray = bracketSequence.toCharArray();
        int length = bracketArray.length;
        //charList = Arrays.asList(bracketArray);
        for (int i = 0; i < length; i++) {
            charList.add(bracketArray[i]);
        }
        if (charList.get(0) == ')') {
            System.out.println("скобочная последовательность не верная");
            return;
        }

        int openingBracket = 0;
        for (int i = 0; i < length; i++) {
            if (charList.get(i) == '(') {
                openingBracket++;
            } else {
                openingBracket--;
            }
            if (openingBracket < 0) {
                break;
            }
        }
        if (openingBracket == 0) {
            System.out.println("скобочная последовательность верная");
        } else {
            System.out.println("скобочная последовательность не верная");
        }

    }
}

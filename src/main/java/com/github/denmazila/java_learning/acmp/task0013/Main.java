package com.github.denmazila.java_learning.acmp.task0013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hiddenNumber = in.nextInt();
        int suggestedTumber = in.nextInt();
        System.out.println(numberOfExactMatches(Main.integerToArrayConversionHiddenNumber(hiddenNumber), integerToArrayConversionSuggestedTumber(suggestedTumber))
                + " " + numberOfIndirectMatches(Main.integerToArrayConversionHiddenNumber(hiddenNumber), integerToArrayConversionSuggestedTumber(suggestedTumber)));
    }

    public static int[] integerToArrayConversionHiddenNumber(int hiddenNumber) {
        int[] arrayHiddenNumber = new int[4];
        arrayHiddenNumber[0] = hiddenNumber / 1000;
        arrayHiddenNumber[1] = (hiddenNumber / 100) % 10;
        arrayHiddenNumber[2] = (hiddenNumber / 10) % 10;
        arrayHiddenNumber[3] = hiddenNumber % 10;
        return arrayHiddenNumber;
    }

    public static int[] integerToArrayConversionSuggestedTumber(int suggestedTumber) {
        int[] arraysuggestedTumber = new int[4];
        arraysuggestedTumber[0] = suggestedTumber / 1000;
        arraysuggestedTumber[1] = (suggestedTumber / 100) % 10;
        arraysuggestedTumber[2] = (suggestedTumber / 10) % 10;
        arraysuggestedTumber[3] = suggestedTumber % 10;
        return arraysuggestedTumber;
    }


    public static int numberOfExactMatches(int[] integerToArrayConversionHiddenNumber, int[] integerToArrayConversionSuggestedTumber) {
        int result1 = 0;
        for (int i = 0; i < integerToArrayConversionHiddenNumber.length; i++) {
            if (integerToArrayConversionHiddenNumber[i] == integerToArrayConversionSuggestedTumber[i]) {
                result1++;
            }
        }
        return result1;
    }

    public static int numberOfIndirectMatches(int[] integerToArrayConversionHiddenNumber, int[] integerToArrayConversionSuggestedTumber) {
        int result2 = 0;
        for (int i = 0; i < integerToArrayConversionSuggestedTumber.length; i++) {
            for (int j = 0; j < integerToArrayConversionHiddenNumber.length; j++) {
                if (integerToArrayConversionSuggestedTumber[i] == integerToArrayConversionHiddenNumber[j] && integerToArrayConversionSuggestedTumber[i] != integerToArrayConversionHiddenNumber[i]) {
                    result2++;
                }
            }
        }
        return result2;
    }
}

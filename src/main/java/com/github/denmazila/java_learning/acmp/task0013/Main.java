package com.github.denmazila.java_learning.acmp.task0013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите четырёхзначное натуральное число которое нужно отгадать: ");
        int hiddenNumber = in.nextInt();
        System.out.print("Введите четырёхзначное натуральное число предложенное отгадывающим: ");
        int suggestedNumber = in.nextInt();
        int[] hidden = Main.integerToArrayConversionHiddenNumber(hiddenNumber);
        int[] suggested = integerToArrayConversionSuggestedNumber(suggestedNumber);
        System.out.println("Число быков:" + numberOfExactMatches(hidden, suggested) + " Число коров:" + numberOfIndirectMatches(hidden, suggested));
    }

    public static int[] integerToArrayConversionHiddenNumber(int hiddenNumber) {
        int[] arrayHiddenNumber = new int[4];
        arrayHiddenNumber[0] = hiddenNumber / 1000;
        arrayHiddenNumber[1] = (hiddenNumber / 100) % 10;
        arrayHiddenNumber[2] = (hiddenNumber / 10) % 10;
        arrayHiddenNumber[3] = hiddenNumber % 10;
        return arrayHiddenNumber;
    }

    public static int[] integerToArrayConversionSuggestedNumber(int suggestedNumber) {
        int[] arraysuggestedNumber = new int[4];
        arraysuggestedNumber[0] = suggestedNumber / 1000;
        arraysuggestedNumber[1] = (suggestedNumber / 100) % 10;
        arraysuggestedNumber[2] = (suggestedNumber / 10) % 10;
        arraysuggestedNumber[3] = suggestedNumber % 10;
        return arraysuggestedNumber;
    }


    public static int numberOfExactMatches(int[] integerToArrayConversionHiddenNumber, int[] integerToArrayConversionSuggestedNumber) {
        int result1 = 0;
        for (int i = 0; i < integerToArrayConversionHiddenNumber.length; i++) {
            if (integerToArrayConversionHiddenNumber[i] == integerToArrayConversionSuggestedNumber[i]) {
                result1++;
            }
        }
        return result1;
    }

    public static int numberOfIndirectMatches(int[] integerToArrayConversionHiddenNumber, int[] integerToArrayConversionSuggestedNumber) {
        int result2 = 0;
        for (int i = 0; i < integerToArrayConversionSuggestedNumber.length; i++) {
            for (int j = 0; j < integerToArrayConversionHiddenNumber.length; j++) {
                if (integerToArrayConversionSuggestedNumber[i] == integerToArrayConversionHiddenNumber[j] && integerToArrayConversionSuggestedNumber[i] != integerToArrayConversionHiddenNumber[i]) {
                    result2++;
                }
            }
        }
        return result2;
    }
}

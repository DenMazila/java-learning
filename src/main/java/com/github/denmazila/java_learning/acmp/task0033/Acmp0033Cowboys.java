package com.github.denmazila.java_learning.acmp.task0033;

import java.util.Scanner;

public class Acmp0033Cowboys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество простреленных банок ковбоем А: ");
        int valueShotsCowboyA = in.nextInt();
        System.out.print("Введите колличество простреленных банок ковбоем В: ");
        int valueShotsCowboyB = in.nextInt();

        int valueOfMissedShotsA = calculateTheNumberOfMissedShotsA(valueShotsCowboyB);
        int valueOfMissedShotsB = calculateTheNumberOfMissedShotsB(valueShotsCowboyA);
        System.out.println("Колличество банок которые не прострелил ковбой А: " + valueOfMissedShotsA + ";");
        System.out.println("Колличество банок которые не прострелил ковбой В: " + valueOfMissedShotsB + ";");

    }

    public static int calculateTheNumberOfMissedShotsA(int valueShotsCowboyB) {
        return valueShotsCowboyB - 1;
    }

    public static int calculateTheNumberOfMissedShotsB(int valueShotsCowboyA) {
        return valueShotsCowboyA - 1;
    }
}

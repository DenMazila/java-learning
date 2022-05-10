package com.github.denmazila.java_learning.acmp.task0033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valueShotsA = in.nextInt();
        int valueShotsB = in.nextInt();
        int valueOfMissedShotsA = valueShotsB - 1;
        int valueOfMissedShotsB = valueShotsA - 1;
        System.out.println(valueOfMissedShotsA + " " + valueOfMissedShotsB);
    }
}

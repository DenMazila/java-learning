package com.github.denmazila.java_learning.acmp.task0021;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= 2; i++) {
            numbers.add(in.nextInt());
        }
        int min = numbers.get(0);
        int max = numbers.get(0);
        int a;

        for (int j = 1; j <= 2; j++) {
            if (min > numbers.get(j)) {
                min = numbers.get(j);
            }
            if (max < numbers.get(j)) {
                max = numbers.get(j);
            }
        }
        a = max - min;
        out.println(a);
        out.flush();
    }
}
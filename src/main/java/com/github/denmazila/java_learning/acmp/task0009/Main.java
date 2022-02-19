package com.github.denmazila.java_learning.acmp.task0009;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            numbers.add(in.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) > 0) {
                sum = sum + numbers.get(i);
            }
        }
        int min = numbers.get(0);
        int max = numbers.get(0);
        int indexmin = 0;
        int indexmax = 0;
        for (int i = 1; i < n; i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
                indexmin = i;
            }
            if (max < numbers.get(i)) {
                max = numbers.get(i);
                indexmax = i;
            }
        }
        int prod = 1;
        if (indexmin < indexmax) {
            for (int i = indexmin + 1; i < indexmax; i++) {
                prod = prod * numbers.get(i);
            }
        } else {
            for (int i = indexmax + 1; i < indexmin; i++) {
                prod = prod * numbers.get(i);
            }
        }

        out.print(sum + " ");
        out.print(prod);
        out.flush();
    }
}

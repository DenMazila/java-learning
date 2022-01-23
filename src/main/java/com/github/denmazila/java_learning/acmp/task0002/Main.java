package com.github.denmazila.java_learning.acmp.task0002;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        if (n < 1) {
            int sum1 = 0;
            for (int i = 2; i > n; i--, sum1 = sum1 + i) {
            }
            out.print(sum1);
        } else {
            int sum = 0;
            for (int i = 0; i < n; i++, sum = sum + i) {
            }                                               // почему без ковычек после цикла for не работает?
            out.print(sum);
        }

        out.flush();
    }
}
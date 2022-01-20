package com.github.denmazila.java_learning.acmp.task0002;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++, sum = sum + i) {
        }                                               // почему без ковычек после цикла for не работает?

        out.print(sum);
        out.flush();
    }
}
package com.github.denmazila.java_learning.acmp.task0014;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long a = in.nextLong();
        long b = in.nextLong();
        long nok = 0l;
        if (a > b) {
            for (int i = 1; i < i + 1; i++) {
                nok = a * i;
                if (nok % b == 0) {
                    break;
                }
            }
        } else {
            for (int i = 1; i < i + 1; i++) {
                nok = b * i;
                if (nok % a == 0) {
                    break;
                }
            }
        }
        out.println(nok);

        out.flush();
    }
}
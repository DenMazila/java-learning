package com.github.denmazila.java_learning.acmp.task0003;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = n / 10; // выделяем значение без последней цифры
        if (a == 0) {
            String c = "25";
            out.print(c);
        } else {
            int b = a * ++a; // заменил (a+1) на ++а
            String c = b + "25";
            out.print(c);
        }

        // out.print(c);
        out.flush();
    }
}
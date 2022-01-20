package com.github.denmazila.java_learning.acmp.task0004;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int b = 9 - k;

        String c = k + "9" + b;


        out.print(c);
        out.flush();
    }
}
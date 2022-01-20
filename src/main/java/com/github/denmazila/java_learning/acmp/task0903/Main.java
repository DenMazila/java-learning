package com.github.denmazila.java_learning.acmp.task0903;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int c = n + 1;
        out.print(c);
        out.flush();
    }
}
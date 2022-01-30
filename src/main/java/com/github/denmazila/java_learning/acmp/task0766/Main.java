package com.github.denmazila.java_learning.acmp.task0766;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int c = n * m;
        if (c >= k) {
            out.print("YES");
        } else {
            out.print("NO");
        }
        out.flush();
    }
}
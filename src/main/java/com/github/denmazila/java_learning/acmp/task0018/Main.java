package com.github.denmazila.java_learning.acmp.task0018;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        if (N == 0) {
            System.out.println(factorial);
            return;
        }
        for (int i = 1; i <= N; i++) {
            BigInteger x = BigInteger.valueOf(i);
            factorial = factorial.multiply(x);
        }
        out.print(factorial);
        out.flush();
    }
}

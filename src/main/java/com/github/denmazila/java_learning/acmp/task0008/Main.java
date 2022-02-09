package com.github.denmazila.java_learning.acmp.task0008;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] myArray = new int[3];
        for (int i = 0; i < 3; i++) {
            myArray[i] = in.nextInt();
        }
        if (myArray[0] * myArray[1] == myArray[2]) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
    }
}
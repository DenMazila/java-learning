package com.github.denmazila.java_learning.acmp.task0005;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int three = 0;
        int four = 0;
        for (int i = 0; i < n; i++) {
            numbers.add(in.nextInt());
        }
        for (int j = 0; j < n; j++) {
            if ((numbers.get(j) % 2) == 1) {
                three = (three + 1);
                out.print(numbers.get(j) + " ");
            }
        }
        out.println(" ");
        for (int k = 0; k < n; k++) {
            if ((numbers.get(k) % 2) == 0) {
                four ++;
                out.print(numbers.get(k) + " ");
            }
        }
        out.println(" ");
        if (four >= three) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();

    }
}
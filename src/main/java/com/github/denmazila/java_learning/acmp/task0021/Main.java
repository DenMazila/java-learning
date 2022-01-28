package com.github.denmazila.java_learning.acmp.task0021;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= 2; i++) {
            numbers.add(in.nextInt());
        }
        int min;
        int max;
        if (numbers.get(0) <= numbers.get(1)) {
            min = numbers.get(0);
        } else if (numbers.get(0) <= numbers.get(2)) {
            min = numbers.get(0);
        } else if (numbers.get(1) <= numbers.get(2)) {
            min = numbers.get(1);
        } else {
            min = numbers.get(2);
        }

        if (numbers.get(0) >= numbers.get(1)) {
            max = numbers.get(0);
        } else if (numbers.get(0) >= numbers.get(2)) {
            max = numbers.get(0);
        } else if (numbers.get(1) >= numbers.get(2)) {
            max = numbers.get(1);
        } else {
            max = numbers.get(2);
        }

        int a = max - min;
        out.print(a);
        out.flush();
    }
}
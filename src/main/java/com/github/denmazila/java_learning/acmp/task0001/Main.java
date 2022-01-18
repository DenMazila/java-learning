package com.github.denmazila.java_learning.acmp.task0001;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        out.print(c);
        out.flush();
    }
}

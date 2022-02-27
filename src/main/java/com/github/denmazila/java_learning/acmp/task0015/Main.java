package com.github.denmazila.java_learning.acmp.task0015;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        byte[][] twoDimArray = new byte[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                twoDimArray[i][j] = in.nextByte();
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((twoDimArray[i][j] == 1) && (twoDimArray[j][i] == 1) && (i != j)) {
                    sum++;
                }
            }
        }
        out.println(sum / 2);
        out.flush();

    }
}

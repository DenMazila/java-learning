package com.github.denmazila.java_learning.acmp.task0942;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();  // n - кол-во элементов массива
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int stud1 = 0;  // stud1 - баллы студента 1 курса
        int sum1 = 0;
        int stud3 = 0;  // stud3 - баллы студента 3 курса
        int sum3 = 0;
        int stud5 = 0;  // stud5 - баллы студента 5 курса
        int sum5 = 0;
        for (int k : array) {
            sum5 += k;
            stud5 += sum5;
        }
        for (int i = n - 1; i >= 0; i--) {
            sum3 += array[i];
            stud3 += sum3;
        }
        //производим сортировку массива array по возрастанию.
        for (int i = 0; i < n; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        for (int k : array) {
            sum1 += k;
            stud1 += sum1;
        }
        if (stud1 <= stud3 & stud1 <= stud3) {
            System.out.println(1);
        }
        if (stud3 <= stud5 & stud3 < stud1) {
            System.out.println(3);
        }
        if (stud5 < stud3 & stud5 < stud1) {
            System.out.println(5);
        }

    }
}

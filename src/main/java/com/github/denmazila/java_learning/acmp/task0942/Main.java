package com.github.denmazila.java_learning.acmp.task0942;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();  // n - кол-во элементов массива
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        int stud5 = getScore(arrayList);  // stud5 - баллы студента 5 курса

        List<Integer> reverse = new ArrayList<>(arrayList);
        Collections.reverse(reverse);
        int stud3 = getScore(reverse);  // stud3 - баллы студента 3 курса

        List<Integer> sorted = new ArrayList<>(arrayList);
        Collections.sort(sorted);
        int stud1 = getScore(sorted);  // stud1 - баллы студента 1 курса

        System.out.println(printWinner(stud5, stud3, stud1));
    }

    private static int printWinner(int stud5, int stud3, int stud1) {
        if (stud1 <= stud3 && stud1 <= stud5) {
            return 1;
        }
        if (stud3 <= stud5) {
            return 3;
        }
        return 5;
    }

    public static int getScore(List<Integer> tasksComplexity) {
        int sum = 0;
        int stud = 0;
        for (int i = 0; i < tasksComplexity.size(); i++) {
            sum += tasksComplexity.get(i);
            stud += sum;
        }
        return stud;
    }
}

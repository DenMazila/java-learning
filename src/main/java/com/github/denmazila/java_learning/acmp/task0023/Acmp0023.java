package com.github.denmazila.java_learning.acmp.task0023;

import java.util.Scanner;

public class Acmp0023 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(calculatingTheSum(n));
    }

    public static int calculatingTheSum(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (n%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

}

package com.github.denmazila.java_learning.acmp.task0007;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        //BigInteger number = new BigInteger ();
        //BigInteger [] MyArray = new BigInteger[3];
        ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();

        for (int i = 0; i < 3; i++) {
            numbers.add(in.nextBigInteger());
        }
        /*var max = MyArray[0];
        var max = numbers.get(0);
        var max1 = numbers.get(1);
        var max2 = numbers.get(2);

        if (max < max1) {
            max = numbers.get(1);
        }
        if (max < MyArray[2]) {
            max = MyArray[2];
        }*/
        out.print(Collections.max(numbers));
        out.flush();

    }
}

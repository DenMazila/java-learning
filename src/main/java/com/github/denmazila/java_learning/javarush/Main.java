package com.github.denmazila.java_learning.javarush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите первую строку: ");
        Scanner scanner = new Scanner (System.in);
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.print("Введите третью строку: ");
        String str3 = scanner.nextLine();

        System.out.println(str3);
        String str2Upper = str2.toUpperCase();
        System.out.println(str2Upper);
        String str1lower = str1.toLowerCase();
        System.out.println(str1lower);

    }
}

package com.github.denmazila.java_learning.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("number", "Hello", "Mama", "1lesons", "arries", "Arries", "русский текст", "()", "[]", ",", "!", "||");
        List<String> sortStringLight = new ArrayList<>(strings);
        sort(sortStringLight);
        System.out.println(sortStringLight);

        StringLengthComparator ss = new StringLengthComparator();
        strings.sort(ss);
        System.out.println(strings);
    }
}

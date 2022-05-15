package com.github.denmazila.java_learning.search;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int value = 3;
        List<Integer> numbers = Arrays.asList(1, 5, -15, 256, 3, -555, 1001);
        System.out.println(search(numbers, value));
        System.out.println(min(numbers));

    }

    public static boolean search(List<Integer> numbers, int value) {
        for (Integer number : numbers) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param numbers Любой непустой список без null элементов
     * @return Минимальное значение в списке.
     */
    public static int min(List<Integer> numbers) {
        if (numbers.isEmpty()){
            throw new IllegalArgumentException();
        }
        if (numbers.contains(null)){
            throw new NullPointerException();
        }
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }
}

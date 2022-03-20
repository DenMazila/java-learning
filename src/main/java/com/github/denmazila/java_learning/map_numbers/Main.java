package com.github.denmazila.java_learning.map_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        Main.class.getResourceAsStream("/numbers.txt")
                )
        );

        List<String> lines = Main.readAllLines(reader); //считали текст с файла в список lines. Каждая строка до ввода элемент списка.

        List<Integer> allNumbers = new ArrayList<>();

        for (String numbersLine : lines) {
            List<Integer> lineNumbers = Main.getNumbers(numbersLine);
            allNumbers.addAll(lineNumbers);
        }

        Map<Integer, Integer> divisibilityStatistics = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            divisibilityStatistics.put(i, numberCount(allNumbers, i));
        }
        //System.out.println(divisibilityStatistics);

        List<Map.Entry<Integer, Integer>> entries1 = new ArrayList<>(divisibilityStatistics.entrySet());
        entries1.sort(Map.Entry.comparingByValue());
        for (int i = entries1.size() - 1; i >= 0; i--) {
            Map.Entry<Integer, Integer> stat = entries1.get(i);
            System.out.println(stat);
        }
//    System.out.println(lines);

    }

    private static int numberCount(List<Integer> num, int divider) {
        int number = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % divider == 0) {
                number++;
            }
        }
        return number;
    }

    private static Map<Integer, Integer> getWordCount(List<Integer> words) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer word : words) {
            // 2. Если слово уже есть в словаре - то переписать значение на X+1;
            if (result.containsKey(word)) {
                Integer currentAmount = result.get(word);
                result.put(word, currentAmount + 1);
            }
            // 1. Если слова еще нет в словаре - добавить что оно используется 1 раз.
            else {
                result.put(word, 1);
            }
        }

        return result;
    }

    private static List<Integer> getNumbers(String line) {
        String[] s = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            int iNumber = Integer.parseInt(s[i]);
            numbers.add(iNumber);
        }
        //List<Integer> numbers = Arrays.asList(in);
        return numbers;
    }

    private static List<String> readAllLines(BufferedReader reader) throws IOException {
        List<String> lines = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            lines.add(line);
        }
        return lines;
    }

}

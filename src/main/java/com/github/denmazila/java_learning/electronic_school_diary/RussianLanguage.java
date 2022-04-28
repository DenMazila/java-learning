package com.github.denmazila.java_learning.electronic_school_diary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RussianLanguage extends ElSchoolDiary {
    Scanner in = new Scanner(System.in);
    private List<Integer> grades = new ArrayList<>();
    private int grade1;
    private String note1;
    private int grade2;

    public RussianLanguage(int grade1, String note1) {
        this.grade1 = grade1;
        grades.add(grade1);
        this.note1 = note1;
    }

    public RussianLanguage(int grade1, int grade2, String note1) {
        this.grade1 = grade1;
        grades.add(grade1);
        this.note1 = note1;
        this.grade2 = grade2;
        grades.add(grade2);
    }

    @Override
    public double calculateAverage() {
        if (grades.size() >= 3) {
            double sum = 0;
            for (Integer grade : grades) {
                sum = sum + grade;
            }
        /*for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }*/
            double result;
            return result = sum / grades.size();
        } else System.out.println("Невозможно вычеслить среднюю оценку по Русскому языку. " +
                "Колличество оценок должно быть больше трёх");
        return 0;
    }
}

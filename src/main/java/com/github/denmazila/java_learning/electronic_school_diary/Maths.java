package com.github.denmazila.java_learning.electronic_school_diary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maths extends ElSchoolDiary {
    Scanner in = new Scanner(System.in);
    static List<Integer> grades = new ArrayList<>();

    private int grade1;
    private int grade2;
    private String note;
    double result;

    public Maths() {
        System.out.println("Нельзя оставлять пустое поле оценки и коментария к оценке");
        set();
    }

    public Maths(int grade1, String note) {
        this.grade1 = grade1;
        grades.add(grade1);
        this.note = note;
    }

    public Maths(int grade1, int grade2, String note) {
        this.grade1 = grade1;
        grades.add(grade1);
        this.note = note;
        this.grade2 = grade2;
        grades.add(grade2);
    }

    private void set() {
        System.out.print("Введи оценку: ");
        grade1 = in.nextInt();
        grades.add(grade1);
        System.out.println();
        System.out.print("Напишите пояснение: ");
        note = in.next();
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
            return result = sum / grades.size();
        } else System.out.println("Невозможно вычеслить среднюю оценку по Математике. " +
                "Колличество оценок должно быть больше трёх");
        return 0;
    }
}

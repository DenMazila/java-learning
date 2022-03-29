package com.github.denmazila.java_learning.electronic_school_diary;

public class Main {
    public static void main(String[] args) {
        Accaunt student = new Accaunt ("№356", "3Б", "Шефер Полина Денисовна");
        ElSchoolDiary maths = new Maths (4, "Домашняя работа", 5, "Контрольная", 3, "Работа на уроке");
        ElSchoolDiary russianLanguage = new RussianLanguage (5, "диктант", 4, "Работа на уроке", 2, "домашняя работа", 5, 4, "сочинение");
        ElSchoolDiary physicalCulture = new PhysicalCulture (5, "работа на уроке", 5, "пресс", 4, "Работа на уроке", 5, "бег на дистанцию 30м.");

        System.out.println();
    }
}

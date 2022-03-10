package com.github.denmazila.java_learning.electronic_school_diary;

public class PhysicalCulture extends ElSchoolDiary {
    private int grade1;
    private String note1;
    private int grade2;
    private String note2;
    private int grade3;
    private String note3;
    private int grade4;
    private String note4;
    double result;

    public PhysicalCulture(int grade1, String note1, int grade2, String note2, int grade3, String note3, int grade4, String note4) {
        this.grade1 = grade1;
        this.note1 = note1;
        this.grade2 = grade2;
        this.note2 = note2;
        this.grade3 = grade3;
        this.note3 = note3;
        this.grade4 = grade4;
        this.note4 = note4;
        this.result = (grade1 + grade2 + grade3 + grade4) / 4;
    }
    @Override
    public double average () {
        return result;
    }
}

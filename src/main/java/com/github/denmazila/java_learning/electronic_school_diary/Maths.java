package com.github.denmazila.java_learning.electronic_school_diary;

public class Maths extends ElSchoolDiary {

    private int grade1;
    private String note1;
    private int grade2;
    private String note2;
    private int grade3;
    private String note3;
    private double result;

    public Maths(int grade1, String note1, int grade2, String note2, int grade3, String note3) {
        this.grade1 = grade1;
        this.note1 = note1;
        this.grade2 = grade2;
        this.note2 = note2;
        this.grade3 = grade3;
        this.note3 = note3;
        result = (grade1 + grade2 + grade3) / 3;
    }
    @Override
    public double average (){
        return result;
    }
}

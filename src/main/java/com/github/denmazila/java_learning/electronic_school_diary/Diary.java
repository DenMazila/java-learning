package com.github.denmazila.java_learning.electronic_school_diary;

import java.util.List;

public class Diary {
    private List<Subject> subjects;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
        System.out.println("Я установил subjects");
    }
}

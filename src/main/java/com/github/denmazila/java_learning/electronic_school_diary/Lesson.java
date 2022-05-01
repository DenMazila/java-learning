package com.github.denmazila.java_learning.electronic_school_diary;

import java.util.List;

public class Lesson {
    private String date;
    private String theme;
    private List<Mark> marks;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}

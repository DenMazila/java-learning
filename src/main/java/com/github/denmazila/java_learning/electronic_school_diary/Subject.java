package com.github.denmazila.java_learning.electronic_school_diary;

import java.util.List;

public class Subject {
    private SubjectName name;
    private List<Lesson> lessons;

    public SubjectName getName() {
        return name;
    }

    public void setName(SubjectName name) {
        this.name = name;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    @Override
    public String toString() {
        String readableName = name.toString();
        if (name == SubjectName.MATH) {
            readableName = "Математика";
        }
        return "Subject{" +
                "предмет: " + readableName +
                "; колличество уроков = " + lessons.size() +
                '}';
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}

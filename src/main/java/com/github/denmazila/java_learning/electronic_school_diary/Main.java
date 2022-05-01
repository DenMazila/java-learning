package com.github.denmazila.java_learning.electronic_school_diary;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        Diary diary = objectMapper.readValue(new File("diary.json"), Diary.class);
//        Diary diary = new Diary();
//        List<String> subjects = diary.getSubjects();
//        subjects.add("Vova");
//        subjects.add("Vasya");
//        diary.setSubjects(subjects);
        objectMapper.writeValue(new File("diary.json"), diary);
        System.out.println(diary.getSubjects());
    }

    public static void scenario1(String[] args) {
        System.out.println("Выберите класс:");
        String classSelected = "3Б";
        System.out.println("Выберите ученика:");
        String studentSelected = "Шефер Полина Денисовна";
        SubjectName name = SubjectName.MATH;
        //Diary diary = student.getCurrentDiary();
        String subjectSelected = "Математика"; // выбранный предмет.
        // SubjectHistory subjectHistory = diary.getSubjectHistory(subjectSelected)
        // Lesson lesson = subjectHistory.getTodayLesson();
        // Найти урок по сегодняшней дате
        System.out.println("Введите оценку");
        System.out.println("Введите примечание");
        // Mark mark = new Mark(valueSelected, comment)
        // lesson.addMark(mark);

    }

}

package com.github.denmazila.java_learning.electronic_school_diary;

import com.github.denmazila.java_learning.electronic_school_diary.repositories.DiaryRepository;

import java.io.IOException;

public class Main {
    private static final DiaryRepository diaryRepository = new DiaryRepository();

    public static void main(String[] args) throws IOException {
//        Diary diary = new DiaryRepository().readDiaryFromFile();   соответствует двум строчкам ниже.
//      DiaryRepository diaryRepository = new DiaryRepository();
        Diary diary = diaryRepository.readDiaryFromFile();

        diaryRepository.saveDiaryFromFile(diary);
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

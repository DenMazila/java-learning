package com.github.denmazila.java_learning.electronic_school_diary;

public class  Main {
    public static void scenario1 (String[] args) {
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

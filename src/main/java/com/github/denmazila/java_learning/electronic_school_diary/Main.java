package com.github.denmazila.java_learning.electronic_school_diary;

import com.github.denmazila.java_learning.electronic_school_diary.repositories.DiaryRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final DiaryRepository diaryRepository = new DiaryRepository();

    public static void main(String[] args) throws IOException {
//        Diary diary = new DiaryRepository().readDiaryFromFile();   соответствует двум строчкам ниже.
//      DiaryRepository diaryRepository = new DiaryRepository();
        Diary diary = diaryRepository.readDiaryFromFile();
        Subject math = null;
        List<Subject> subjects = diary.getSubjects();
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getName().equals(SubjectName.MATH)) {
                math = subjects.get(i);
            }
        }
        if (math == null) {
            math = new Subject();
            math.setName(SubjectName.MATH);
            math.setLessons(new ArrayList<Lesson>());
        }

        Lesson lesson = null;
        List<Lesson> lessons = math.getLessons();
        for (int i = 0; i <lessons.size() ; i++) {
            if (lessons.get(i).getDate().equals("05.05.2022")) {
                lesson = lessons.get(i);
            }
        }
        if (lesson == null){
            lesson = new Lesson();
            lesson.setDate("05.05.2022");
            lesson.setTheme("Домашняя работа");
            lesson.setMarks(new ArrayList<Mark>());
        }

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

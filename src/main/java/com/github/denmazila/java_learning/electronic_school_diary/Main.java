package com.github.denmazila.java_learning.electronic_school_diary;

public class  Main {
    public static void main(String[] args) {
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






        Account student1 = new Account("356", "3Б", "Шефер Полина Денисовна");
        ElSchoolDiary maths = new Maths (4, "Домашняя работа");
        ElSchoolDiary maths2 = new Maths (5, "Контрольная");
        ElSchoolDiary maths3 = new Maths (3, "Работа на уроке");
        ElSchoolDiary maths4 = new Maths();
        ElSchoolDiary russianLanguage1 = new RussianLanguage (5, "диктант");
        ElSchoolDiary russianLanguage2 = new RussianLanguage (4, "Работа на уроке");
        ElSchoolDiary russianLanguage3 = new RussianLanguage (5, "диктант");
        ElSchoolDiary russianLanguage4 = new RussianLanguage (2, "домашняя работа");
        ElSchoolDiary russianLanguage5 = new RussianLanguage (5, 4, "сочинение");
        ElSchoolDiary physicalCulture1 = new PhysicalCulture (5, "работа на уроке");
        ElSchoolDiary physicalCulture2 = new PhysicalCulture (5, "пресс");
        ElSchoolDiary physicalCulture3 = new PhysicalCulture (4, "Работа на уроке");
        ElSchoolDiary physicalCulture4 = new PhysicalCulture (5, "бег на дистанцию 30м.");


        //maths.addMark()
        System.out.println("Средняя оценка по математике:" + maths3.calculateAverage());
        System.out.println("Средняя оценка по русскому языку:" + russianLanguage5.calculateAverage());
        System.out.println("Средняя оценка по русскому физической культуре:" + physicalCulture4.calculateAverage());
    }

}

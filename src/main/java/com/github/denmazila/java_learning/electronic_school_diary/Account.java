package com.github.denmazila.java_learning.electronic_school_diary;

public class Account {
//    private String numberSchool;
//    private String numberClass;
    private String ownerName;
    int id = 0;

    public Account(String numberSchool, String numberClass, String ownerName){
//        this.numberSchool = numberSchool;
//        this.numberClass = numberClass;
        this.ownerName = ownerName;
        this.id = id++;
        System.out.println("Вы добавили в базу нового ученика: " + "Средняя №" + numberSchool +
                "; Класс: " + numberClass + "; ФИО: " + ownerName);
    }


}

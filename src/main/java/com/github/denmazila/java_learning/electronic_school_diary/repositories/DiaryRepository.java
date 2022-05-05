package com.github.denmazila.java_learning.electronic_school_diary.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.denmazila.java_learning.electronic_school_diary.Diary;

import java.io.File;
import java.io.IOException;

public class DiaryRepository {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public Diary readDiaryFromFile() throws IOException {
        Diary diary = objectMapper.readValue(new File("diary.json"), Diary.class);
        return diary;
    }

    public void saveDiaryFromFile(Diary diary) throws IOException {
        objectMapper.writeValue(new File("diary.json"), diary);
    }

}

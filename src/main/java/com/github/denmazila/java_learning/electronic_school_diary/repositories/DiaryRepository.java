package com.github.denmazila.java_learning.electronic_school_diary.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.denmazila.java_learning.electronic_school_diary.Diary;

import java.io.File;
import java.io.IOException;

public class DiaryRepository {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public Diary readDiaryFromFile() throws IOException {
        return objectMapper.readValue(new File("diary.json"), Diary.class);
    }

    public void saveDiaryFromFile(Diary diary) throws IOException {
        objectMapper.writeValue(new File("diary.json"), diary);
    }

}

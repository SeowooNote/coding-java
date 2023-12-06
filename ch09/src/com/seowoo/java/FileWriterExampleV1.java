package com.seowoo.java;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterExampleV1 {
    private static final String TARGET_TEXT_FILE = "diary.txt";

    public static void main(String[] args) throws IOException {
        // 1. FileWriter 생성
        FileWriter fileWriter = new FileWriter(TARGET_TEXT_FILE, StandardCharsets.UTF_8);

        // 2. write() 메서드
        String title = "오늘의 할일\n";
        char[] walk = {'1', '.', ' ', '산', '책', '하', '기', '\n'};
        char[] reading = {'2', '.', ' ', '독', '서', '하', '기'};

        fileWriter.write(title);
        fileWriter.write(walk);
        fileWriter.write(reading);

        // 3. flush() 메서드
        fileWriter.flush();

        // 4. close() 메서드
        fileWriter.close();
    }
}

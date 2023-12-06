package com.seowoo.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedFileReaderExampleV1 {
    private static final int EOF = -1;
    private static final String TARGET_TEXT_FILE = "sample-2mb-text-file.txt";

    public static void main(String[] args) throws IOException {
        // 1. FileReader 생성
        BufferedReader fileReader = new BufferedReader( new FileReader(TARGET_TEXT_FILE, StandardCharsets.UTF_8));

        // 2. 버퍼로 읽기
        long startTime = System.currentTimeMillis();
        while(EOF != fileReader.read()) {
            // do nothing
        }

        long readTime = System.currentTimeMillis() - startTime;
        System.out.println(TARGET_TEXT_FILE + "을 읽는 시간? " + readTime + "ms");
        fileReader.close(); // 사용후 반드시 닫아 줍니다

        FileReader fileReader2 = new FileReader(TARGET_TEXT_FILE, StandardCharsets.UTF_8);
        long startTime2 = System.currentTimeMillis();
        while(EOF != fileReader2.read()) {
            // do nothing
        }
        
        long readTime2 = System.currentTimeMillis() - startTime2;
        System.out.println(TARGET_TEXT_FILE + "을 읽는 시간? " + readTime2 + "ms");
        fileReader2.close();
        
    }
}

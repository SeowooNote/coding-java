package com.seowoo.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemReaderV1 {
    private static final String POEM_FILE = "poem.txt";

    public static void main(String[] args) throws IOException {

        // 1. FileReader 생성
        BufferedReader bufferedReader = new BufferedReader(new FileReader(POEM_FILE, StandardCharsets.UTF_8));

        // 2. 제목과 작가 출력
        String title = bufferedReader.readLine();
        String author = bufferedReader.readLine();
        System.out.println("제목: " + title);
        System.out.println("작가: " + author);

        // 3. 내용 출력
        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        
        bufferedReader.close(); // 사용후 반드시 닫아줍니다.
    }
}

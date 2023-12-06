package com.seowoo.java;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderExampleV1 {
    private static final int EOF = -1;

    public static void main(String[] args) throws IOException {
        // 1. FileReader 생성
        FileReader fileReader = new FileReader("hello.txt", StandardCharsets.UTF_8);

        // 2. 한글자씩 읽기
        int readInt;
        while(EOF != (readInt = fileReader.read())){
            char ch = (char) readInt;
            System.out.println("입력 데이터: " + ch);
        }

        fileReader.close();
    }
}

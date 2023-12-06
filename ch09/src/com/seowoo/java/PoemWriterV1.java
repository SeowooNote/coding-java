package com.seowoo.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemWriterV1 {
    private static final String DEFAULT_INPUT_FILE = "poem.txt";
    private static final String DEFAULT_OUT_FILE = "poem_copy.txt";

    private String outputFile;

    public PoemWriterV1(String outFile) {
        this.outputFile = outFile;
    }

    public String readInputPoem(String inputFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(DEFAULT_INPUT_FILE, StandardCharsets.UTF_8));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append('\n');
        }
        
        bufferedReader.close(); // 사용 후에는 반드시 닫아줍니다.

        return stringBuilder.toString();
    }

    public void writeOutput(String content) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8));

        bufferedWriter.write(content);
        bufferedWriter.flush(); // 버퍼의 내용을 비웁니다.
        bufferedWriter.close(); // 사용 후에는 반드시 닫아줍니다.
    }

    public static void main(String[] args) throws IOException {
        // 1. poemWriter 객체 생성
        PoemWriterV1 poemWriterV1 = new PoemWriterV1(DEFAULT_OUT_FILE);

        // 2. poem.txt 파일 읽기
        String original = poemWriterV1.readInputPoem(DEFAULT_INPUT_FILE);
        System.out.println("== 원본 내용 ==");
        System.out.println(original);

        // 3. poem_copy.txt 파일 쓰기
        poemWriterV1.writeOutput(original);

        // 4. 내용 확인
        String copied = poemWriterV1.readInputPoem(DEFAULT_OUT_FILE);
        System.out.println("== 사본 내용 ==");
        System.out.println(copied);
    }
}

package com.seowoo.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemWriterV2 {
    private static final String DEFAULT_INPUT_FILE = "poem.txt";
    private static final String DEFAULT_OUTPUT_FILE = "poem.txt";
    private static final String EMPTY_STRING = "";

    private String outputFile;

    public PoemWriterV2(String outFile) {
        this.outputFile = outFile;
    }

    public String readInputPoem(String inputFile) {
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
        } catch(IOException e) {
            System.out.println("IOException 발생: " + e.getMessage());
            return EMPTY_STRING;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try {
            while((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch(IOException e) {
            System.out.println("IOException 발생: " + e.getMessage());
            //IOException 발생시에는 빈 문자열을 반환하기로 함 
            return EMPTY_STRING;
        } finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                } 
            } catch(IOException e) {
                    e.printStackTrace();
            }
        }

        return stringBuilder.toString();
    }

    public void writeOutput(String content) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8));
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("IOException 발생: " + e.getMessage());
        } finally {
            try {
                if(bufferedWriter != null) bufferedWriter.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args){
        // 1. PoemWriter 객체 생성
        PoemWriterV2 poemWriterV2 = new PoemWriterV2(DEFAULT_OUTPUT_FILE);

        // 2. poem.txt 파일 읽기
        String original = poemWriterV2.readInputPoem(DEFAULT_INPUT_FILE);
        System.out.println("== 원본내용 ==");
        System.out.println(original);

        // 3. poem_copy.txt 파일 쓰기
        poemWriterV2.writeOutput(original);

        // 4. 내용 확인
        String copied = poemWriterV2.readInputPoem(DEFAULT_OUTPUT_FILE);
        System.out.println("== 사본내용 ==");
        System.out.println(copied);
    }
}

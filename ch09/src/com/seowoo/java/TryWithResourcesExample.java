package com.seowoo.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesExample {
    private static final String TARGET_TEXT_FILE = "sample-text-file.txt";

    public static void main(String[] args) {
        // try with resources 문법 try(내용) -> 스트림을 닫느 .close() 자동 실행, fianlly 문이 사라져 내용이 간결해짐(추천)
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(TARGET_TEXT_FILE, StandardCharsets.UTF_8))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println("라인: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException 발생: " + e.getMessage());
        }
    }
}

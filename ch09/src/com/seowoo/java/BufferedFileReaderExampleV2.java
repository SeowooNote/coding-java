package com.seowoo.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedFileReaderExampleV2 {
    private static final String TARGET_TEXT_FILE = "sample-text-file.txt";

    public static void main(String[] args) {
        // 1. FileReader 생성
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(TARGET_TEXT_FILE, StandardCharsets.UTF_8));
        } catch(IOException e) {
            System.out.println("IOException 발생: " + e.getCause());
            return;
        }

        // 2. 버퍼로 읽기;
        String line;
        try{
            while((line = bufferedReader.readLine()) != null) {
            System.out.println("라인: " + line);
            }
        } catch(IOException e) {
            System.out.println("IOException 발생: " + e.getMessage());
        } finally {
            try {
                if(bufferedReader != null) bufferedReader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}

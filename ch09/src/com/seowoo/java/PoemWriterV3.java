package com.seowoo.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemWriterV3 {
    private static final String DEFAULT_INPUT_FILE = "poem.txt";
    private static final String DEFAULT_OUTPUT_FILE = "poem_copy2.txt";
    private static final String EMPTY_STRING = "";

    private String outputFile;

    public PoemWriterV3(String outFile) {
        this.outputFile = outFile;
    }

    public String readInputPoem(String inputFile) {
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))) {
            while((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생: " + e.getMessage());
			return EMPTY_STRING;
		} catch (IOException ioe) {
			System.out.println("IOException 발생: " + ioe.getMessage());			
			return EMPTY_STRING;
		}

        return stringBuilder.toString();
    }

    public void writeOutput(String content) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))) {
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch(IOException e) {
			System.out.println("IOException 발생: " + e.getMessage());
		}
    }

    public static void main(String[] args) {
        // 1. PoemWriter 객체 생성
        PoemWriterV3 poemWriterV3 = new PoemWriterV3(DEFAULT_OUTPUT_FILE);

        // 2. poem.txt 파일 읽기
        String original = poemWriterV3.readInputPoem(DEFAULT_INPUT_FILE);
        System.out.println("== 원본 내용 ==");
        System.out.println(original);

        poemWriterV3.writeOutput(original);

        // 4. 내용 확인
        String copide = poemWriterV3.readInputPoem(DEFAULT_OUTPUT_FILE);
        System.out.println("== 사본 내용 ==");
        System.out.println(copide);
    }
    
}

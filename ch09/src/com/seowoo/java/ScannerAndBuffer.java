package com.seowoo.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerAndBuffer {
    public static void main(String[] args) throws IOException {
        long startScanner = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = scanner.nextLine();

        System.out.print("나이 입력: ");
        int age = scanner.nextInt();

        System.out.println("이름 : " + name + ", 나이 : " + age);
        long endScanner = System.currentTimeMillis() - startScanner;
        System.out.println("Scanner 시간: " + endScanner + " ms");

        System.out.println("----------------------");

        long startBuffer = System.currentTimeMillis();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름 입력: ");
        String name2 = bufferedReader.readLine();

        System.out.print("나이 입력: ");
        int age2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("이름 : " + name2 + ", 나이 : " + age2);
        long endBuffer = System.currentTimeMillis() - startBuffer;
        System.out.println("Buffer 시간: " + endBuffer + " ms");
    }
}

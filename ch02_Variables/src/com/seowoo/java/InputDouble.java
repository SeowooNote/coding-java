package com.seowoo.java;

import java.util.Scanner;

public class InputDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 실수를 입력하세요 : ");
        double first = scanner.nextDouble();
        System.out.print("두번째 실수를 입력하세요 : ");
        double second = scanner.nextDouble();
        double added = first + second;
        System.out.println("두 실수의 합은 " + added + " 입니다.");
        scanner.close();
    }
}

package com.seowoo.java;

import java.util.Scanner;

public class InputNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int first = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int second = scanner.nextInt();
        int added = first + second;
        System.out.println("두 숫자의 합은 " + added + " 입니다.");
        scanner.close(); // Scanner 누수 방지
    }

}

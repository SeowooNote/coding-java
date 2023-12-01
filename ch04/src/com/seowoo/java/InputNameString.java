package com.seowoo.java;

import java.util.Scanner;

public class InputNameString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요? ");
        String name = scanner.nextLine();
        scanner.close();

        System.out.println(name + "님 반값습니다!");
    }
}

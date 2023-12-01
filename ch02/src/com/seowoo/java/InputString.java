package com.seowoo.java;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("사는 곳을 입력하세요 : ");
        String city = scanner.nextLine();
        System.out.println(city + "에 사는 " + name + "님 반갑습니다!");
        scanner.close();
    }
}

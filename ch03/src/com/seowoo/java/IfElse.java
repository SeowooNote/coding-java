package com.seowoo.java;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // 2. if와 else
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적을 입력해 주세요 : ");
        int score = scanner.nextInt();
        scanner.close();

        if(score <= 100 && score > 90) System.out.println("A");
        else if(score <= 90 && score > 80) System.out.println("B");
        else if(score <= 80 && score > 70) System.out.println("C");
        else if(score <= 70 && score > 60) System.out.println("D");
        else System.out.println("F");
    }
}

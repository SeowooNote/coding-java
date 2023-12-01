package com.seowoo.java;

import java.util.Scanner;

public class WhileContinueV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 1;
        System.out.println("짝수만 출력됩니다.");
        while(i <= num) {
            if(i % 2 != 0){
                i++;
                continue;
            } 
            System.out.println(i);
            i++;
        }
    }
}

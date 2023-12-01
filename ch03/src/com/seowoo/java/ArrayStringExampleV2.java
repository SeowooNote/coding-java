package com.seowoo.java;

import java.util.Scanner;

public class ArrayStringExampleV2 {
    
    public static void main(String[] args) {
        String[] cities = new String[10];

        Scanner scanner = new Scanner(System.in);
        int count = 3;
        for(int index = 0; index < count; index++) {
            System.out.print((index + 1) + "번째 도시를 입력하세요 : ");
            cities[index] = scanner.nextLine();
        }
        scanner.close();

        System.out.println("----------------------");
        System.out.println("입력한 도시의 개수는 : " + count);
        System.out.println("첫번째 도시는 : " + cities[0]);
        System.out.println("두번째 도시는 : " + cities[1]);
        System.out.println("마지막 도시는 : " + cities[count - 1]);
    }

}
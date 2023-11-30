package com.seowoo.java;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        String[] cities = new String[10];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 도시를 입력하세요 : ");
        cities[index++] = scanner.nextLine();
        System.out.print("두번째 도시를 입력하세요 : ");
        cities[index++] = scanner.nextLine();
        System.out.print("세번째 도시를 입력하세요 : ");
        cities[index++] = scanner.nextLine();
        scanner.close();

        System.out.println("-------------------");
        System.out.println("입력한 도시의 개수는 " + index);
        System.out.println("첫번쨰 도시는 " + cities[0]);
        System.out.println("두번쨰 도시는 " + cities[1]);
        System.out.println("마지막번째 도시는 " + cities[index - 1]);
    }
}

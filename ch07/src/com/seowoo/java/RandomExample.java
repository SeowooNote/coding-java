package com.seowoo.java;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUMBERS = 10;

        // 1. 정수형 난수
        System.out.println("정수형 난수");
        for(int i = 0; i < NUMBERS; i++) {
            System.out.print(random.nextInt() + " ");
        }
        System.out.println();
        System.out.println();

        // 2. 정수형 난수(bounded)
        System.out.println("정수형 난수(bounded) - bounded 범위 까지만 random");
        for(int i = 0; i < NUMBERS; i++) {
            System.out.print(random.nextInt(1000) + " ");
        }
        System.out.println();
        System.out.println();

        // 3. double 형 난수
        System.out.println("double 형 난수");
        for(int i = 0; i < NUMBERS; i++) {
            System.out.print(random.nextDouble() + " ");
        }
        System.out.println();
        System.out.println();

        // 4. float 형 난수
        System.out.println("float 형 난수");
        for(int i = 0; i < NUMBERS; i++) {
            System.out.print(random.nextFloat() + " ");
        }
        
    }
}

package com.seowoo.java;

import java.util.Random;

public class SystemExample {
    public static void main(String[] args) {
        // 1. 시간측정
        long startTime = System.currentTimeMillis();
        long startNano = System.nanoTime();

        createDummyObjects(100000);

        long timeMills = System.currentTimeMillis() - startTime;
        long timeNano = System.nanoTime() - startNano;
        System.out.println("시간측정: " + timeMills + "ms ");
        System.out.println("시간측정: " + timeNano + "ns ");

        // 2. 환경변수(environment variables)
        System.out.println(System.getenv());
        System.out.println("PATH: " + System.getenv("PATH"));
    }

    static void createDummyObjects(int number) {
        Random random = new Random();
        for(int i = 0; i < number; i ++) {
            new String("Dummy" + random.nextInt());
        }
    }
}

package com.seowoo.java;

public class 비트연산자 {
    public static void main(String[] args) {
        // 비트 AND(&)
        int a = 0x0A;
        int mask1 = 0x01;
        int mask2 = 0x02;
        System.out.println("16진수 a의 첫번째 자리수는? : " + (a & mask1));
        System.out.println("16진수 a의 두번째 자리수는? : " + (a & mask2));

        // 비트 OR(|)
        System.out.println("7(0x111) OR 15(0x1000) = " + (7 | 16));
        System.out.println("8(0x100) OR 15(0x111) = " + (8 | 15));
    }
}

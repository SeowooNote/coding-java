package com.seowoo.java;

public class WhileBasic {
    public static void main(String[] args) {
        // 1. 구구단 (3단)
        int dan = 3;
        int i = 1;

        while(i <= 9){
            System.out.println(dan + " * " + i + " = " + (dan * i));
            i++;
        }
    }
}

package com.seowoo.java;

public class WhileContinueV2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int i = 0;

        while(i < numbers.length) {
            int num = numbers[i];
            if(num < 5) {
                i++;
                continue;
            }
            System.out.println(numbers[i]);
            i++;
        }
    }
}

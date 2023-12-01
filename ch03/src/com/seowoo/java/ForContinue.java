package com.seowoo.java;

public class ForContinue {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if(num < 5) continue;
            System.out.println(numbers[i]);
        }
    }
}

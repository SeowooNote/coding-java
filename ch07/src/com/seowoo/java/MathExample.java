package com.seowoo.java;

public class MathExample {
    public static void main(String[] args) {
        // 1. 절대값
        double a = 108.3;
        float b = -99.337f;
        
        System.out.println(a + "의 절대값: " + Math.abs(a));
        System.out.println(b + "의 절대값: " + Math.abs(b));

        // 2. 최대값 & 최소값
        int[] positiveNumbers = {100, 200, 90};
        int max = 0;
        for(int number: positiveNumbers) {
            max = Math.max(max, number);
        }
        System.out.print("최대값은 " + max);

        double[] realNumbers = {8974.3, -200000, 100.9};
        double min = Double.MAX_VALUE;
        for(double number: realNumbers) {
            min = Math.min(min, number);
        }
        System.out.print("최소값은 " + min);

        // 3. 반올림, 올림, 내림
        System.out.print("반올림: {");
        for(double number : realNumbers) {
            System.out.print(Math.round(number) + ",");
        }
        System.out.println("}");

        System.out.print("올림: {");
        for(double number : realNumbers) {
            System.out.print(Math.ceil(number) + ",");
        }
        System.out.println("}");

        System.out.print("버림: {");
        for(double number : realNumbers) {
            System.out.print(Math.floor(number)+  ",");
        }
        System.out.println("}");
    }
}

package com.seowoo.java;

public class VariableUsage {
    
    public static void main(String[] args) {
        // 1. 변수 선언과 정의를 한번에
        int studentNum = 500;
        String name = "Do Seo Woo";
        double gradeJava = 4.0;
        double gradeC = 3.8;
        double avg = 0;

        // 2. 연산 (재정의)
        avg = (gradeJava + gradeC) / 2;
        name = "Do, SeoWoo";
        studentNum = 600;
    }

}

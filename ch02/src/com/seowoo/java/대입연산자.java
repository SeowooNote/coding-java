package com.seowoo.java;

public class 대입연산자 {
    
    public static void main(String[] args) {
        int studentNo = 100;
        String studentName = "Do Seo Woo";
        double grade = 4.0;

        System.out.println("학번 : " + studentNo);
        System.out.println("이름 : " + studentName);
        System.out.println("학점 : " + grade);

        double v = 100;
        v+=3; System.out.println(" v += 3 : " + v);
        v-=3; System.out.println(" v -= 3 : " + v);
        v*=3; System.out.println(" v *= 3 : " + v);
        v/=3; System.out.println(" v /= 3 : " + v);
        v%=3; System.out.println(" v %= 3 : " + v);
    }

}

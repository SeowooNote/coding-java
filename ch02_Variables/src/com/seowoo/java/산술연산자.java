package com.seowoo.java;

public class 산술연산자 {
    
    public static void main(String[] args) {
        int added = 100 + 200;
        int substracted = 500 - 300;
        int multiplied = 10 * 20;
        double divided = 100 / 3;

        System.out.println("덧셈 결과 : 100 + 200 = " + added);
        System.out.println("뺼셈 결과 : 500 - 300 = " + substracted);
        System.out.println("곱셈 결과 : 10 * 20 = " + multiplied);
        System.out.println("나눗셈 결과 : 100 / 3 = " + divided);

        int 몫 = 100 / 3;
        int 나머지 = 100 % 3;
        System.out.println("목 : 100 / 3 = " + 몫);
        System.out.println("나머지 : 100 % 3 = " + 나머지);

        ++added;
        --substracted;
        System.out.println("증가 : ++added = " + added);
        System.out.println("감소 : --substracted = " + substracted);
    }

}

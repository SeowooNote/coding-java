package com.seowoo.java;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // 1. 성적 데이터 (이름, 국어. 영어, 수학 순)
        String grade = "김강윤 80 90 100";

        // 2. 성적 데이터 출력
        StringTokenizer stringTokenizer = new StringTokenizer(grade);
        while(stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            System.out.println(token);
        }
    }
}

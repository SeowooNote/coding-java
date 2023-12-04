package com.seowoo.java;

public class StringBuilderExample {
    public static void main(String[] args) {
        // 0. 기본정보
        String title = "Java API doc";
        String pakage = "java.lang";
        String cls = "StringBuilder";
        String description = "StringBuilder는 문자열을 생성해줌";
        String seeAlso = "구) StringBuffer 클래스";

        // 1. String을 사용한 문자열 구성
        String apiDoc = title + "\n" +
                "패키지: " + pakage + "\n" + 
                "클래스: " + cls + "\n" + 
                "내용: " + description + "\n" + 
                "비고: " + seeAlso;
        System.out.println(apiDoc);
        System.out.println("--------------------------------");

        // 2. StringBuilder를 사용한 문자열 구성
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title).append("\n")
                    .append(("패키지: ")).append(pakage).append("\n")
                    .append("클래스: ").append(cls).append("\n")
                    .append("내용: ").append(description).append("\n")
                    .append("비고: ").append(seeAlso);
        System.out.println(stringBuilder);
    }
}

package com.seowoo.java;

public class PersonExampleV1 {
    // 멤버 변수
    String firstName = "자바";
    String lastName = "김";
    int age = 25;
    int height = 182;

    // 멤버 함수
    void goToOffice(String destination) {
        System.out.println(getKoreanName() + "님이 " + destination + "으로 출근합니다.");
    }

    String getKoreanName() {
        return lastName + " " + firstName;
    }

    public static void main(String[] args) {
        PersonExampleV1 person = new PersonExampleV1();
        person.goToOffice("부산");
    }
}

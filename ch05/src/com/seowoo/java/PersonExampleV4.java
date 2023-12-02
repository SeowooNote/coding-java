package com.seowoo.java;

public class PersonExampleV4 {
    private static final String DEFAULT_DESTINATION = "집";
    private static final int DEFAULT_AGE = 0;
    private static final int DEFAULT_HEIGHT = 0;

    // 멤버 변수
    private String firstName;
    private String lastName;
    private int age = DEFAULT_AGE;
    private int height = DEFAULT_HEIGHT;
    private String destination = DEFAULT_DESTINATION;

    // 메서드
    public void goToOffice(final String destination) {
        this.destination = destination;
        System.out.println(getKoreanName(firstName, lastName) + "님이 " + destination + "로 출근합니다.");
    }

    public String getPlace() {
        return destination;
    }

    private static String getKoreanName(String firstName, String lastName) {
        return lastName + " " + firstName;
    }

}

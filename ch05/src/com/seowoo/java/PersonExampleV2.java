package com.seowoo.java;

public class PersonExampleV2 {
    // 멤버 변수
    String firstName = "자바";
    String lastName = "김";
    int age = 25;
    int height = 182;

    // 생성자
    PersonExampleV2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    PersonExampleV2(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    PersonExampleV2(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        PersonExampleV2 person1 = new PersonExampleV2("Java", "Kim");
        PersonExampleV2 person2 = new PersonExampleV2("Java", "Kim", 23);
        PersonExampleV2 person3 = new PersonExampleV2("Java", "Kim", 23, 178);
    }
}

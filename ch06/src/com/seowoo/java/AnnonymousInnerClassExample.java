package com.seowoo.java;

class OuterClass {
    private int age = 21;
    protected int newAge = 19;

    public void printAge() {
        System.out.println("외부 클래스의 나이? " + age);
    }
}

public class AnnonymousInnerClassExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass() {
            @Override
            public void printAge() {
                System.out.println("새로운 나이? " + newAge);
            }
        };

        outerClass.printAge();
    }
}

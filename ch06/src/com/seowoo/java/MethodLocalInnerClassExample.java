package com.seowoo.java;

class OuterClass {
    private int outerAge = 21;

    public void printOuterAge() {
        System.out.println("외부 클래스의 나이? " + outerAge);

        class InnerClass {
            private int innerAge = 25;

            public void printInnerAge() {
                System.out.println("외부 클래스의 나이? " + outerAge);
                System.out.println("내부 클래스의 나이? " + innerAge);
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.printInnerAge();
    }
}

public class MethodLocalInnerClassExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printOuterAge();
    }
}

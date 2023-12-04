package com.seowoo.java;

class OuterClass {
    private int outerAge = 22;
    private static int outerStaticAge = 38;

    public void printOuterAge() {
        System.out.println("외부 클래스의 나이? " + outerAge);

        //외부 클래스에서는 내부 클래스를 접근할 수 없음 
		//System.out.println("내부 클래스의 나이? " + innerAge); //컴파일 오류
    }

    private static void printOuterStaticAge() {
        System.out.println("외부 클래스의 정적 나이? " + outerStaticAge);
    }

    static class InnerClass {
        private int innerAge = 25;

        public void printInnerAge() {
            System.out.println("내부 클래스의 나이? " + innerAge);

            // 외부 클래스의 static 멤버 변수에 접근 가능
            System.out.println("외부 클래스의 정적 나이? " + outerStaticAge);
        }

        public void printStaticOuterAge() {
            printOuterStaticAge();
        }
    }
}

public class StaticNestedClassExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        outerClass.printOuterAge();
        innerClass.printInnerAge();
        innerClass.printStaticOuterAge();
    }
}

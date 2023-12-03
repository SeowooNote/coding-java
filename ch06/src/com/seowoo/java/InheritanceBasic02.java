package com.seowoo.java;

class SuperClass {
    public int publicNumber = 100;
    protected String protectedKey = "KM-01-9867";

    public void print(String message) {
        System.out.println("SUPER: " + protectedKey);
    }

    protected String getKey() {
        System.out.println("SUPER: getKey() 호출");
        return protectedKey;
    }
}

class SubClass extends SuperClass {
    public String getKey() {
        System.out.println("SUB: getKey() 호출");
        return "SUB-" + super.protectedKey;
    }

    public void printSub(String message) {
        System.out.println("SUB: " + message);
    }
}

public class InheritanceBasic02 {
    public static void main(String[] args) {
        // 1. 상위 클래스로 선언
        SuperClass superClass = new SuperClass();
        superClass.print("상위 클래스의 메서드를 호출합니다.");
        System.out.println("key?: " + superClass.getKey());

        // 2. 자식 클래스로 선언
        SubClass subClass = new SubClass();
        System.out.println("Subkey?: " + subClass.getKey());
        
    }
}

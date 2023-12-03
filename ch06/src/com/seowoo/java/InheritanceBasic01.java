package com.seowoo.java;

class ParentClass {
    public int publicField = 999;
    private String privateField;

    public void publicMethod(String arg) {
        System.out.println("부모 클래스의 pubilc method 입니다. args? " + arg);
    }

    private void privateMethod() {
        System.out.println("부코 클래스의 private method 입니다. 상속되지 않습니다.");
    }
}

class ChildClass extends ParentClass {
    // 내용 없음
}

public class InheritanceBasic01 {
    public static void main(String[] args) {
        // 1. 부모 클래스로 선언
        ParentClass parentClass = new ParentClass();
        parentClass.publicMethod("부모 클래스로 선언");
        System.out.println("부모 클래스의 public field 값? " + parentClass.publicField);

        // 2. 자식 클래스로 선언
        ChildClass childClass = new ChildClass();
        childClass.publicMethod("자식 클래스로 호출");
        System.out.println("자식 클래스의 public field 값? " + childClass.publicField);
    }
}

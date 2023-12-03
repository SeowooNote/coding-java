package com.seowoo.java;

class DefaultConstructorParentClass {

}

class PrivateConstructorParentClass {
    private PrivateConstructorParentClass() {

    }

    public PrivateConstructorParentClass(String args) {
        System.out.println("PrivateConstructorParentClass 객체가 생성되었습니다. arg? " + args);
    }
}

class ChildClassA extends DefaultConstructorParentClass {
    public ChildClassA() {
        System.out.println("ChildClassA 객체가 생성되었습니다.");
    }
}

class ChildClassB extends PrivateConstructorParentClass {
    public ChildClassB(String args) {
        super(args);
    }
}

public class InheritanceBasic04 {
    public static void main(String[] args) {
        // 1. 부모 클래스에 생성자가 없는 경우
        DefaultConstructorParentClass defaultConstructorParentClass = new ChildClassA();
        ChildClassA childClassA = new ChildClassA();

        // 2. 부모 클래스에 private 생성자만 존재하는 경우
        PrivateConstructorParentClass pariPrivateConstructorParentClass = new ChildClassB("부모 클래스로 선언");
        ChildClassB childClassB = new ChildClassB("자식 클래스로 선언");
    }
    
}

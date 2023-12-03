package com.seowoo.java;

class ColoredParent {
    public String getPrimaryColor() {
        return "red";
    }
    public String getSecondaryColor() {
        return "blue";
    }
}

class PuppleChild extends ColoredParent {
    @Override
    public String getSecondaryColor() {
        return "pupple";
    }
}

public class MethodOverridingExampleV1 {
    public static void main(String[] args) {
        // 1. 부모 객체 생성
        ColoredParent coloredParent1 = new ColoredParent();
        System.out.println("1차 색상? " + coloredParent1.getPrimaryColor());
        System.out.println("2차 색상? " + coloredParent1.getSecondaryColor());

        // 2. 자식 객체 생성
        ColoredParent coloredParent2 = new PuppleChild();
        System.out.println("1차 색상? " + coloredParent2.getPrimaryColor());
        System.out.println("2차 색상? " + coloredParent2.getSecondaryColor());
    }
}

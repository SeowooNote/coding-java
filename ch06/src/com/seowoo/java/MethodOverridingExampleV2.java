package com.seowoo.java;

class GreenGrass extends ColoredParent {
    @Override
    public String getPrimaryColor() {
        return "green";
    }

    @Override
    public String getSecondaryColor() {
        return "yellow";
    }
}

public class MethodOverridingExampleV2 {
    public static void main(String[] args) {
        // 1. 부모 클래스로 배열 객체 선언
        ColoredParent[] cps = {
            new ColoredParent(),
            new PuppleChild(),
            new GreenGrass()
        };

        for(ColoredParent coloredParent : cps) {
            System.out.println("1차 색상? " + coloredParent.getPrimaryColor());
            System.out.println("2차 색상? " + coloredParent.getSecondaryColor());
        }
    }
}

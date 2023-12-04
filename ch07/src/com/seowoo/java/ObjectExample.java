package com.seowoo.java;

public class ObjectExample {
    public static void main(String[] args) {
        // 1. Object 객체 생성
        Object object1 = new Object();
        Object object2 = new Object();

        // 2. equal() 메서드
        boolean isSameEqual = object1.equals(object1); // true
        boolean isABEqual = object1.equals(object2); // false

        System.out.println("같은 객체의 equals? " + isSameEqual);
        System.out.println("다른 객체의 equals? " + isABEqual);

        // 3. hashCode() 메서드
        int hashCodeA = object1.hashCode();
        int hashCodeB = object2.hashCode();
        String hexHashCodeA = Integer.toHexString(hashCodeA);
        String hexHashCodeB = Integer.toHexString(hashCodeB);
        System.out.println("object1 객체의 hash code? " + hexHashCodeA);
        System.out.println("object2 객체의 hash code? " + hexHashCodeB);

        // 4. toString() 메서드
        System.out.println("object1.toString()? " + object1.toString());
        System.out.println("object2.toString()? " + object2.toString());
    }
    
}

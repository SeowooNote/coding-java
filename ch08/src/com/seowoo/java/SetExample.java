package com.seowoo.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    
    public static void main(String[] args){
        // 0. 자료 준비
        Set<String> alphabets = SetBasic.prepareAlphabets();

        // 1. addAll() 메서드
        Set<String> others = new HashSet<>();
        others.add("E");
        others.add("F");
        alphabets.addAll(others);
        System.out.println("AddAll() 후 alphabets? " + alphabets);

        // 2. contains() 메서드
        System.out.println("집합에 A 포함? " + alphabets.contains("A")); // true
        System.out.println("집합에 K 포함? " + alphabets.contains("K")); // false

        // 3. iterator() 메서드
        Iterator<String> iterator = alphabets.iterator();
        while (iterator.hasNext()) {
            System.out.println("알파벳: " + iterator.next());
        }

        // 4. toArray() 메서드
        String[] alphas = alphabets.toArray(new String[0]);
        System.out.println("알파벳[0]: " + alphas[0]);
        System.out.println("알파벳[1]: " + alphas[1]);
        System.out.println("알파벳[2]: " + alphas[2]);
        System.out.println("알파벳[3]: " + alphas[3]);
        System.out.println("알파벳[4]: " + alphas[4]);
        System.out.println("알파벳[5]: " + alphas[5]);

        for(String index : alphas) {
            System.out.println(index);
        }

        for(int i = 0; i < alphas.length; i++) {
            System.out.println("알파벳[" + i + "]: " + alphas[i]);
        }

        // 5. clear(), isEmpty() 메서드
        alphabets.clear();
        System.out.println("clear() 후 빈 집합? " + alphabets);

    }
}

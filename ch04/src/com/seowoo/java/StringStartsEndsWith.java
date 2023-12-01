package com.seowoo.java;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        // 1. startWith()
        String[] poem = {
            "Two roads diverged in a yello wood",
            "And Sorry I could not travel both",
            "And be one traveller, long I stood"
        };

        for(int i = 0; i < poem.length; i++) {
            String line = poem[i];
            boolean startWithAnd = line.startsWith("And");
            System.out.println((i+1) + " 번째 줄은 And로 시작하나요? " + startWithAnd);
        }

        // 2. endsWith()
        for(int i = 0; i < poem.length; i++) {
            String line = poem[i];
            boolean endsWithOod = line.endsWith("ood");
            System.out.println((i+1) + "번째 줄은 ood로 끝나나요? " + endsWithOod);
        }

    }
}

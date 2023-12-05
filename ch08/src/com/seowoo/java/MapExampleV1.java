package com.seowoo.java;

import java.util.Map;
import java.util.Set;

public class MapExampleV1 {
    private static final String KEY_FR = "프랑스";
    private static final String KEY_EN = "영국";
    
    public static void main(String[] args) {
        // 0. 자료준비
        Map<String, String> capitalMap = MapBasic.prepareCapitalMap();

        // 1. remove() 메서드
        System.out.println("원본 맵: " + capitalMap);
        capitalMap.remove(KEY_FR); // 없는키 -> 아무변화 X
        capitalMap.remove(KEY_EN); // 있는키 -> 해당 key와 value값 삭제
        System.out.println("영구 제거후: " + capitalMap);

        // 2. keySet() 메서드
        Set<String> keySet = capitalMap.keySet();
        for(String key : keySet) {
            System.out.println("키: " + key);
        }

        // 3. containsKey() 메서드
        boolean hasFranceKey = capitalMap.containsKey(KEY_FR); // false
        boolean hasEnglandKey = capitalMap.containsKey(KEY_EN); // true
        System.out.println(KEY_FR + " 키 존재? " + hasFranceKey);
        System.out.println(KEY_EN + " 키 존재? " + hasEnglandKey);

        // 4. clear(), isEmpty() 메서드
        capitalMap.clear(); // 모든 해당 Map의 key와 value값 삭제
        System.out.println("clear() 후 맵: " + capitalMap);
        System.out.println("isEmpty()? " + capitalMap.isEmpty());
    }

}

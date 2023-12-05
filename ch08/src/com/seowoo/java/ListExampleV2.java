package com.seowoo.java;

import java.util.List;

public class ListExampleV2 {
    private static final String EARTH = "지구";
    private static final String SATURN = "토성";
    
    public static void main(String[] args) {
        // 0. 데이터 준비
        List<String> planets = ListExampleV1.preparePlanetList();

        // 1. contains() 메서드
        boolean hasEarth = planets.contains(EARTH);
        boolean hasSaturn = planets.contains(SATURN);
        System.out.println("지구가 존재하는가? " + hasEarth); // true
        System.out.println("토성이 존재하는가? " + hasSaturn); // false

        // 2. indexOf() 메서드
        int earthIndex = planets.indexOf(EARTH); // 2
        int saturnIndex = planets.indexOf(SATURN); // -1
        System.out.println("지구의 인덱스? " + earthIndex);
        System.out.println("토성의 인덱스? " + saturnIndex);

        // 3. lastIndexOf() 메서드
        planets.add(EARTH); // planets = ["수성", "금성", "지구", "지구"]
        int lastEarthIndex = planets.lastIndexOf(EARTH); // 3
        System.out.println("지구의 마지막 인덱스? " + lastEarthIndex);

        // 4. remove() 메서드
        planets.remove(lastEarthIndex); // planets = ["수성", "금성", "지구"]

        // 5. set() 메서드
        planets.set(earthIndex, "지구(Earth)"); // planets = ["수성", "금성", "지구(Earth)"]
        System.out.println("행성들: " + planets);

        // 6. toArray() 메서드
        String[] planetArr = planets.toArray(new String[0]);
        for(String planet : planetArr) {
            System.out.println("행성: " + planet);
        }
    }

}

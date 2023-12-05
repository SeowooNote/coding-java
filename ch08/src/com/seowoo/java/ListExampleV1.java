package com.seowoo.java;

import java.util.ArrayList;
import java.util.List;

public class ListExampleV1 {
    static List<String> preparePlanetList() {
        List<String> planet = new ArrayList<>();
        planet.add("수성");
        planet.add("금성");
        planet.add("지구");
        return planet;
    }

    public static void main(String[] args) {
        // 0. 데이터 준비
        List<String> planets = preparePlanetList();
        System.out.println(planets);

        // 1. add(index, E) 메서드 - 데이터 해당 인덱스에 추가
        planets.add(3, "화성");
        System.out.println("화성 추가 후: " + planets);

        // 2. addAll() 메서드 - 데이터 모두 추가
        List<String> otherPlanets = new ArrayList<>();
        otherPlanets.add("목성");
        otherPlanets.add("토성");
        otherPlanets.add("천왕성");
        planets.addAll(otherPlanets);
        System.out.println("행성 추가 후: " + planets);

        // 3. clear() 메서드 - 데이터 모두 삭제
        planets.clear();
        System.out.println("claer() 후: " + planets);

        // 4. isEmpty() 메서드 - 해당 리스트가 비었는지? return boolean형
        boolean isEmpty = planets.isEmpty();
        int size = planets.size();
        System.out.println("planets 리스트가 비어있는가? " + isEmpty); // true
        System.out.println("planets 리스트의 사이즈는? " + size); // false
    }
}

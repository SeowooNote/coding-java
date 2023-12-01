package com.seowoo.java;

public class SwitchExtended {
    public static void main(String[] args) {
        String[] planets = {"수성", "금성", "지구", "화성", "목성", "토성"};

        for(String planet: planets) {
            switch(planet) {
                case "수성": // fall-through - 의도적으로 누학된 것이면 관습적으로 주석처리로 표시
                case "금성": // fall-through
                case "화성": // fall-through
                case "목성": // fall-through
                case "토성": // fall-through
                    System.out.println(planet + "으로 우주 여행을 가자!");
                    break;
                case "지구":
                    System.out.println(planet + "로 우주여행을 가자!");
            }
        }
    }
}

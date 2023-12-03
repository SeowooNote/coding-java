package com.seowoo.java;

public class SpeedCar implements Car {
    private static final int DEFAULT_ACCEL = 10;
    private static final String SPEED_UNIT = "km/h";

    // 멤버 변수
    private String carNumber;
    private int speed = 0;

    // 생성자
    SpeedCar(String carNumber) {
        this.carNumber = carNumber;
    }
    
    @Override
    public void start() {
        System.out.println("내 차량 " + carNumber + "에 시동을 겁니다");
        accelerate();
    }
    
    @Override
    public void accelerate() {
        accelerate(DEFAULT_ACCEL);
    }

    @Override
    public void accelerate(int km) {
        speed += km;
        printSpeed(speed);
    }

    @Override
    public void decelerateHalf() {
        speed *= 0.5;
        printSpeed(speed);
    }

    @Override
    public void decelerateAs(int km) {
        speed -= km;
        printSpeed(speed);
    }

    private static void printSpeed(final int speed) {
        System.out.println("시속: " + speed + SPEED_UNIT);
    }
}

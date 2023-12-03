package com.seowoo.java;

public class CarExampleV4 {
    public static void main(String[] args) {
        SpeedCar speedCar = new SpeedCar("우8322");
        speedCar.start();
        speedCar.accelerate();
        speedCar.accelerate(70);
        speedCar.decelerateAs(60);
        speedCar.decelerateHalf();
    }
}

package com.seowoo.java;

public class ArrayDouble {
    public static void main(String[] args) {
        double[] sensorData;
        sensorData = new double[] {
            1.0,
            2.0,
            3.0
        };

        int firstIndex = 0;
        int lastIndex = sensorData.length - 1;

        System.out.println("첫번째 센서 데이터 : " + sensorData[firstIndex]);
        System.out.println("마지막 센서 데이터 : " + sensorData[lastIndex]);
        System.out.println("센서 데이터 갯수 : " + sensorData.length);
    }
}

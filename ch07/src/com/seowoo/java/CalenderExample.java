package com.seowoo.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {
        // 1. 날짜 형식 정하기
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

        // 2. 오늘 날짜
        Calendar calendar = Calendar.getInstance();
        String today = simpleDateFormat.format(calendar.getTime());
        System.out.println("오늘은 " + today);

        // 3. 어제 날짜
        calendar.add(Calendar.DATE, -1);
        String yesterday = simpleDateFormat.format(calendar.getTime());
        System.out.println("어제는 " + yesterday);

        // 4. 5개월 후
        calendar.add(Calendar.DATE, +1);
        calendar.add(Calendar.MONTH, +5);
        String afterFiveMonths1 = simpleDateFormat.format(calendar.getTime());
        System.out.println("5개월 후 날짜는 " + afterFiveMonths1);

        Calendar now = Calendar.getInstance();
        now.add(Calendar.MONTH, +5);
        String afterFiveMonths2 = simpleDateFormat.format(now.getTime());
        System.out.println("5개월 후 날짜는 " + afterFiveMonths2);
    }
}

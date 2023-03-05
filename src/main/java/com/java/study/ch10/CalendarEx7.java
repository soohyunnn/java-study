package com.java.study.ch10;

import java.util.Calendar;

public class CalendarEx7 {
    public static void main(String[] args) {
        args = new String[2];
        args[0] = "2023";
        args[1] = "3";
        if(args.length != 2) {
            System.out.println("Usage: java CalendarEx7 2015 9");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance(); //시작일
        Calendar eDay = Calendar.getInstance(); //끝일

        //월의 경우 0부터 11까지의 값을 가지므로 1을 빼줘야한다.
        //예를 들어, 2015년 11월 1일은 sDay.set(2015, 10, 1)과 같이 해줘야한다.
        sDay.set(year, month - 1, 1);  //입력월의 1일로 설정한다.
        //입력월의 말일로 설정한다.
        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
        //1일이 속한 주의 일요일로 날짜 설정
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
        //말일이 속한 주의 토요일로 날짜설정
        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("     " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        //시작 일부터 마지막 일까지(sDay <= eDay) 1일씩 증가시켜가면서 일(Calendar.DATE)을 출력한다.
        for(int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
            int day = sDay.get(Calendar.DATE);
            System.out.print((day < 10) ? "  " + day : " " + day);
            if(n++ % 7 == 0) System.out.println();
        }

    }
}

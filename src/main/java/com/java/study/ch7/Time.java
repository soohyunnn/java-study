package com.java.study.ch7;

public class Time {
    private int hour;      //접근 제어자를 private으로 하여 외부에서 직접 접근하지 못하도록 한다.
    private int minute;
    private int second;

    public int getHour() { return hour; }
    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() { return second; }
    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }


}

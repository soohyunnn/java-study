package com.java.study.ch10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}

public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);
        p(today.with(firstDayOfNextMonth()));  //다음 달의 첫 날
        p(today.with(firstDayOfMonth()));  //이 달의 첫 날
        p(today.with(lastDayOfMonth()));  //이 달의 마지막 날
        p(today.with(firstInMonth(DayOfWeek.TUESDAY))); //이 달의 첫번째 화요일
        p(today.with(lastInMonth(DayOfWeek.TUESDAY)));  //이 달의 마지막 화요일
        p(today.with(previous(DayOfWeek.TUESDAY)));  //지난 주 화요일
        p(today.with(previousOrSame(DayOfWeek.TUESDAY))); //지난 주 화요일(오늘 포함)
        p(today.with(next(DayOfWeek.TUESDAY)));  //다음 주 화요일
        p(today.with(nextOrSame(DayOfWeek.TUESDAY)));  //다음 주 화요일(오늘 포함)
        p(today.with(dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));  //이 달의 4번째 화요일

    }
    static void p(Object obj) {
        System.out.println(obj);
    }

}

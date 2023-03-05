package com.java.study.ch8;

import static java.lang.Math.negateExact;
import static java.lang.System.out;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        out.println("i = " + i);
        out.println("-i = " + (-i));

        try {
            out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
            out.printf("negateExact(%d) = %d%n", -10, negateExact(-10));
            out.printf("negateExact(%d) = %d%n", i, negateExact(i));  //예외발생
        } catch (Exception e) {
            //i를 long타입으로 형변환한 후 negateExact(long a)를 호출한다.
            out.printf("negateExact(%d) = %d%n", (long) i, negateExact((long) i));
        }
    }
}

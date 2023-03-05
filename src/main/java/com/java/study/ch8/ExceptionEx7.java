package com.java.study.ch8;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);   //0으로 나눠서 ArithmeticException 발생시킨다.
            System.out.println(4);   //실행되지 않는다.
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {  //ArithmeticException을 제외한 모든 예외가 처리된다.
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}

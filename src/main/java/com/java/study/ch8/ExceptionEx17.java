package com.java.study.ch8;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try{
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static int method1() throws Exception {
        try{
            System.out.println("method1()이 호출되었습니다.");
            return 0;  //현재 실행 중인 메서드를 종료한다.
        } catch (Exception e) {
            e.printStackTrace();
//            return 1;
            throw new Exception();  //return문 대신 예외를 호출한 메서드로 전달.
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었습니다.");
        }
    }
}

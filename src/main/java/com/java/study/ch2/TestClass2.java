package com.java.study.ch2;

public class TestClass2 {

    int iv;  //인스턴스변수
    static int cv;  //클래스변수

    void instanceMethod() {  //인스턴스 메서드
        System.out.println(iv);  //인스턴스메서드에서는 인스턴스변수를 바로 사용가능
        System.out.println(cv);  //인스턴스메서드에서는 클래스변수를 바로 사용가능
    }

    static void staticMethod() {   //static 메서드
        //System.out.println(iv);  //클래스메서드에서는 인스턴스변수를 사용할 수 없다. (에러발생)
        System.out.println(cv);  //클래스메서드에서는 클래스변수를 바로 사용가능
    }


}

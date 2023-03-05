package com.java.study.ch2;

public class TestClass {

    void instanceMethod() {}  //인스턴스메서드
    static void staticMethod() {}  //클래스메서드

    void instanceMethod2() {
        instanceMethod();  //인스턴스메서드는 인스턴스메서드에서 호출가능
        staticMethod();  //클래스메서드는 인스턴스메서드에서 호출가능
    }

    static void staticMethod2() {
        //instanceMethod();  //인스턴스메서드는 클래스메서드에서 호출불가 (에러발생)
        staticMethod();  //클래스메서드는 클래스메서드에서 호출가능
    }

}

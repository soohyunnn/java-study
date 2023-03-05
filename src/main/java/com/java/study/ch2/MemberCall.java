package com.java.study.ch2;

public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv;  //에러발생. 클래스변수는 인스턴스변수를 사용할 수 없다.
    static int cv2 = new MemberCall().iv;  //객체를 생성해서 인스턴스변수를 사용할 수 있다.

    static void staticMethod1() {
        System.out.println(cv);
        //System.out.println(iv);  //에러발생. 클래스메서드에서는 인스턴스변수를 사용할 수 없다.
        MemberCall c = new MemberCall();
        System.out.println(c.iv);  //객체를 생성해서 인스턴스변수를 사용할 수 있다.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);  //인스턴스메서드에서는 인스턴스변수를 바로 사용가능
    }

    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1();  //에러발생. 클래스메서드에서는 인스턴스메서드를 호출할 수 없다.
        MemberCall c = new MemberCall();
        c.instanceMethod1();  //객체를 생성해서 인스턴스메서드를 호출할 수 있다.
    }

    void instanceMethod2() {
        staticMethod1();  //인스턴스메서드에서는 클래스메서드를 바로 호출할 수 있다.
        instanceMethod1();  //인스턴스메서드에서는 인스턴스메서드를 바로 호출할 수 있다.
    }

}

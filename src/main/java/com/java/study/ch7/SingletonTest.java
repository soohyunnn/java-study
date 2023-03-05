package com.java.study.ch7;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        //...
    }

    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        }
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        //Singleton s = new Singleton();  //에러! Singleton의 생성자는 Singleton클래스 내부에서만 사용할 수 있다.
        Singleton s = Singleton.getInstance();  //유일한 인스턴스를 얻는다.
    }
}

package com.java.study.ch7;

public class InnerEx3 {
    private  int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;  //외부 클래스의 private멤버도 접근 가능하다.
        int iiv2 = outerCv;
    }

    static class StaticInner {
        //static 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//        int siv = outerIv;
        static int scv = outerCv;  //외부 클래스의 private멤버도 접근 가능하다.
    }

    void myMethod() {
        int lv = 0;  //jdk1.8부터는 final이 생략된 것으로 간주한다.
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            //외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능하다.
            int liv3 = lv;  //jdk1.8부터는 에러가 아님
            int liv4 = LV;
        }
    }


}

package com.java.study.ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmsss = "235959"))
public class AnnotationEx5 {
    public static void main(String[] args) {
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy()" + anno.testedBy());
        System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmsss());

        for (String str : anno.testTools()) {
            System.out.println("testTools=" + str);
        }
        System.out.println();

        //AnnotationEx5에 적요된 모든 어노테이션을 가져온다.
        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation a : annoArr) {
            System.out.println(a);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)  //실행 시에 사용가능하도록 지정
@interface TestInfo {
    int count() default  1;
    String testedBy();
    String[] testTools() default "JUnit";

    TestType testType() default TestType.FIRST;
    DateTime testDate();

}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();
    String hhmmsss();
}


enum TestType {FIRST, FINAL}




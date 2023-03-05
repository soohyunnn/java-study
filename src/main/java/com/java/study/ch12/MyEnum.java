//package com.java.study.ch12;
//
//abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
//    static int id = 0;  //객체에 붙일 일련번호(0부터 시작)
//
//    int ordinal;
//    String name = "";
//
//    public int ordinal() {
//        return ordinal;}
//
//    MyEnum(String name) {
//        this.name = name;
//        ordinal = id++;  //객체를 생성할 때마다 id의 값을 증가시킨다.
//    }
//
//    public int compareTo(T t) {
//        return ordinal - t.ordinal();
//    }
//}

package com.java.study.ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        while (it.hasNext()) {  //순방향으로 진행하면서 읽어온다.
            Object obj = it.next();
            System.out.print(obj);
        }
        System.out.println();

        while (it.hasPrevious()) {  //역방향으로 진행하면서 읽어온다.
            Object obj = it.previous();
            System.out.print(obj);
        }
        System.out.println();

    }
}

package com.java.study.ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student3> studentStream = Stream.of(
                new Student3("이자바", 3, 300),
                new Student3("김자바", 1, 200),
                new Student3("안자바", 2, 100),
                new Student3("박자바", 2, 150),
                new Student3("소자바", 1, 200),
                new Student3("나자바", 3, 290),
                new Student3("김자바", 3, 180)
        );
        studentStream.sorted(Comparator.comparing(Student3::getBan)  //반별 정렬
                        .thenComparing(Comparator.naturalOrder()))  //기본 정렬
                .forEach(System.out::println);
    }

}

class Student implements Comparable<Student3> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }
    String getName() { return name; }
    int getBan() { return ban; }
    int getTotalScore() { return totalScore; }

    //총점 내림차순을 기본 정렬로 한다.
    public int compareTo(Student3 s) {
        return s.totalScore - this.totalScore;
    }
}






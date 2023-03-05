package com.java.study.ch7;

public class CDPlayer extends Player{


    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }

    // CDPlayer클래스에 추가로 정의된 멤버
    int currentTrack;  //현재 재생중인 트랙

    void nextTrack() {  //다음 트랙으로 이동
        currentTrack++;
    }

    void preTrack() {   //이전 트랙으로 이동
        currentTrack--;
    }
}

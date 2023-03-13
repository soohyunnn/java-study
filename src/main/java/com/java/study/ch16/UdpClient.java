package com.java.study.ch16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UdpClient {
    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramScoket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        //데이터가 저장될 공간으로 byte배열을 생성한다.
        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramScoket.send(outPacket);  //DatagramPacket을 전송한다.
        datagramScoket.receive(inPacket);  //DatagramPacket을 수신한다.

        System.out.println("current server time :" + new String(inPacket.getData()));

        datagramScoket.close();
    }

    public static void main(String[] args) {
        try {
            new UdpClient().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

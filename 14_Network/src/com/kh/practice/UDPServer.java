package com.kh.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket(8090)){
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("준비 완료!");
			
			while(true) {
				System.out.println("... 요청대기중 ...");
				ds.receive(dp);
				System.out.println("접속 IP : " + dp.getAddress());
				System.out.println("전송 데이터 : " + new String(dp.getData()));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

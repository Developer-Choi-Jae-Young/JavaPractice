package com.kh.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		try (DatagramSocket ds = new DatagramSocket()) {
			//InetAddress iNet = InetAddress.getLocalHost();
			InetAddress iNet = InetAddress.getByName("192.168.10.11");
			
			while(true) {
				System.out.print("메세지를 입력하세요 : ");
				String message = sc.nextLine();

				DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, iNet, 8090);

				ds.send(dp);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.kh.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		
		try {			
			InetAddress iNet = InetAddress.getLocalHost();
			System.out.println(iNet);
			System.out.println("내 PC정보 : " + iNet.getHostName());
			System.out.println("내 IP 주소 : " + iNet.getHostAddress());
			
			System.out.println("========================================");
			
			InetAddress iNet2 = InetAddress.getByName("www.naver.com");
			System.out.println("Naver 서버명 : " + iNet2.getHostName());
			System.out.println("Naver IP 주소 : " + iNet2.getHostAddress());
			
			System.out.println("========================================");
			
			InetAddress[] iNet3 = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 호스트 개수 : " + iNet3.length + "개");
			
			for(int i = 0; i < iNet3.length; i++) {
				System.out.println(i + 1 + "번째 Naver 서버명 : " + iNet3[i].getHostName());
				System.out.println(i + 1 + "번째 Naver IP 주소 : " + iNet3[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

package com.kh.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		
		try {			
			InetAddress iNet = InetAddress.getLocalHost();
			System.out.println(iNet);
			System.out.println("�� PC���� : " + iNet.getHostName());
			System.out.println("�� IP �ּ� : " + iNet.getHostAddress());
			
			System.out.println("========================================");
			
			InetAddress iNet2 = InetAddress.getByName("www.naver.com");
			System.out.println("Naver ������ : " + iNet2.getHostName());
			System.out.println("Naver IP �ּ� : " + iNet2.getHostAddress());
			
			System.out.println("========================================");
			
			InetAddress[] iNet3 = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("���̹� ȣ��Ʈ ���� : " + iNet3.length + "��");
			
			for(int i = 0; i < iNet3.length; i++) {
				System.out.println(i + 1 + "��° Naver ������ : " + iNet3[i].getHostName());
				System.out.println(i + 1 + "��° Naver IP �ּ� : " + iNet3[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
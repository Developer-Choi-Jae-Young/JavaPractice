package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
	}

}

package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int first =  sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (first + second));
		System.out.println("���� ��� : " + (first - second));
		System.out.println("���ϱ� ��� : " + (first * second));
		System.out.println("������ �� ��� : " + (first / second));
	}

}

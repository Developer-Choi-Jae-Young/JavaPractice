package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		System.out.println("���� : " + (width * height));
		System.out.println("�ѷ� : " + (width + height) * 2);
	}
}

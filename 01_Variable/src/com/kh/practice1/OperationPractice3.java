package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("���� : ");
			double a = scanner.nextDouble();
			System.out.print("���� : ");
			double b = scanner.nextDouble();
			System.out.print("���� : ");
			double c = scanner.nextDouble();
			
			System.out.println("���� : " + (int)(a + b + c));
			System.out.println("��� : "+ (int)(a + b + c) / 3);
		}
}

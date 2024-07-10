package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("±¹¾î : ");
			double a = scanner.nextDouble();
			System.out.print("¿µ¾î : ");
			double b = scanner.nextDouble();
			System.out.print("¼öÇÐ : ");
			double c = scanner.nextDouble();
			
			System.out.println("ÃÑÁ¡ : " + (int)(a + b + c));
			System.out.println("Æò±Õ : "+ (int)(a + b + c) / 3);
		}
}

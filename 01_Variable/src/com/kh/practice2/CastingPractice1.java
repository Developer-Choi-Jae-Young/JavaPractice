package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		System.out.print("¹®ÀÚ : ");
		
		Scanner sc = new Scanner(System.in);
		
		char a = sc.nextLine().charAt(0);
		
		System.out.printf("%c unicode : %d", a, (int)a);
	}
}

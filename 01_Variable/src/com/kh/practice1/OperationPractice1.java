package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int first =  sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int second = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나누기 몫 결과 : " + (first / second));
	}

}

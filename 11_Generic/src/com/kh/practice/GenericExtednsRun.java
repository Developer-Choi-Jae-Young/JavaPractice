package com.kh.practice;

public class GenericExtednsRun {

	public static void main(String[] args) {
		print(123);
	}
	
	//T는 Number Class와 상속받은 클래스들만 허용
	public static <T extends Number> void print(T value) {
		System.out.println(value);
	}
}

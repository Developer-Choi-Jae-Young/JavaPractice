package com.kh.practice;

public class GenericExtednsRun {

	public static void main(String[] args) {
		print(123);
	}
	
	//T�� Number Class�� ��ӹ��� Ŭ�����鸸 ���
	public static <T extends Number> void print(T value) {
		System.out.println(value);
	}
}
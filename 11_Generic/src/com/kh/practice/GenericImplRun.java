package com.kh.practice;

interface Inter1<T> {
	void method1(T data);
}

interface Inter2<F> {
	void method2(F data);
}

class DataClass04<E> implements Inter1<E>, Inter2<E> {
	public void method1(E data) {
		System.out.println(data);
	}

	public void method2(E data) {
		System.out.println(data);
	}
}

public class GenericImplRun {

	public static void main(String[] args) {
		DataClass04<String> d4 = new DataClass04<>();
		Inter1<String> i4 = new DataClass04<>();
		d4.method1("우왕");
		d4.method1("여름이당");
		
		i4.method1("테스트");
		i4.method1("테스트");
		((DataClass04<String>)i4).method2("테스트2");
	}
}

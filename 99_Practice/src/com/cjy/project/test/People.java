package com.cjy.project.test;

public class People implements Verb{
	private String name;
	private int age;
	private int eyes;
	@Override
	public void walk() {
		System.out.println("�ȴ´�.");
	}
	@Override
	public void read() {
		System.out.println("�д´�.");
	}
	@Override
	public void talk() {
		System.out.println("���Ѵ�.");
	}
}


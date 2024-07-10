package com.cjy.project.test;

public class People implements Verb{
	private String name;
	private int age;
	private int eyes;
	@Override
	public void walk() {
		System.out.println("걷는다.");
	}
	@Override
	public void read() {
		System.out.println("읽는다.");
	}
	@Override
	public void talk() {
		System.out.println("말한다.");
	}
}


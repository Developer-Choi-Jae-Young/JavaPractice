package com.kh.practice.test1;

public class Task1 extends Thread{
	@Override
	public void run() {
		String hello = "Hello, World!";
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + hello);
	}
}

package com.kh.practice.test1;

public class Task2 implements Runnable{
	@Override
	public void run() {
		String hello = "Hi Thread?";
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + hello);
	}
}

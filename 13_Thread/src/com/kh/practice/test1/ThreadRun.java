package com.kh.practice.test1;

public class ThreadRun {
	/*
	 *  Thread : 프로세스 내에서 가지고 있는 최소 작업 단위
	 */
	public static void main(String[] args) {
		Thread t1 = new Task1();
		Thread t2 = new Thread(new Task2());
		
		t1.start();
		t2.start();
		
		System.out.println("========== " + Thread.currentThread().getName() + " ==========");
	}
}

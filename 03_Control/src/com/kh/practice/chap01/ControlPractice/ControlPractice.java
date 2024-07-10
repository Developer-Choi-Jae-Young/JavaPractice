package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {
	public void practice11() {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("비밀번호 입력(1000~9999) : ");
		 * 
		 * String password = sc.nextLine();
		 * 
		 * if(password.length() < 4) { System.out.print("자리수가 안맞음"); return; }
		 * 
		 * if(Integer.parseInt(password) < 1000) { System.out.print("앞자리가 0"); return; }
		 * 
		 * char[] c = password.toCharArray();
		 * 
		 * for(int i = 0; i < c.length; i++) { for(int j = i + 1; j < c.length; j++) {
		 * if(c[i] == c[j]) { System.out.print("중복 값 있음"); return; } } }
		 * 
		 * System.out.print("생성 성공");
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("비밀번호 입력(1000~9999) : ");
		 * 
		 * if(password < 1000) { System.out.print("앞자리가 0"); return; }
		 * 
		 * if(password >= 10000) { System.out.print("자리수가 안맞음"); return; }
		 * 
		 * int forth = password / 1000; int thr = (password - (forth * 1000)) / 100; int
		 * sec = password - ((forth * 1000) + (thr * 100)) / 10; int fir = password -
		 * ((forth * 1000) + (thr * 100) + (sec * 10));
		 * 
		 * if(forth == thr || forth == sec || forth == fir || thr == sec || thr == fir
		 * || sec == fir) { System.out.print("중복 값 있음"); return; }
		 * 
		 * System.out.print("생성 성공");
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("비밀번호 입력(1000~9999) : ");
		 * 
		 * int password = sc.nextInt();
		 * 
		 * if(password > 1000) { if(password <= 10000) { int forth = password / 1000;
		 * int thr = (password - (forth * 1000)) / 100; int sec = password - ((forth *
		 * 1000) + (thr * 100)) / 10; int fir = password - ((forth * 1000) + (thr * 100)
		 * + (sec * 10));
		 * 
		 * if(forth == thr || forth == sec || forth == fir || thr == sec || thr == fir
		 * || sec == fir) { System.out.print("중복 값 있음"); } else {
		 * System.out.print("생성 성공"); } } else { System.out.print("자리수가 안맞음"); } } else
		 * { System.out.print("앞자리가 0"); }
		 */

		/*
		 * for(int i = 1; i < 10; i ++) { for(int j = 2; j < 10; j++) {
		 * System.out.print(j + " X " + i + " = " + j * i + "\t"); }
		 * System.out.print("\n"); }
		 */

		/*int num = 5;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if( i == 0 || i == (num -1) ) {
					System.out.print("*");
				} else {
					if(j == 0 || j  == (num - 1) ) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
		
		
		for(int i  = 0; i < num; i++) {
			for(int j = 0; j <= i * 2; j++ ) {
				
				for(int k = 0; k < num - (i + 1); k++ ) {
					if(j > 0) break;
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < num * 2; i++) {
			
			if(i < num) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}
			
			if(i > num) {
				for (int j = i; j < num * 2; j++) {
					System.out.print("*");
				}
			}
			
			if(i == num) continue;
			System.out.print("\n");
		} */
	}
}

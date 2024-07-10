package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String strKind = sc.next();
		System.out.print("이름 : ");
		String strName = sc.next();
		System.out.print("맛 : ");
		String strFlavor = sc.next();
		System.out.print("개수 : ");
		int strNumOf = sc.nextInt();
		System.out.print("가격 : ");
		int strPrice = sc.nextInt();
		
		System.out.println(scr.saveData(strKind, strName, strFlavor, strNumOf, strPrice));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String checkInformation = sc.next();
		
		if(checkInformation.equals("y")) {
			System.out.println(scr.confirmData()); 
		} else {
			
		}
	}
}

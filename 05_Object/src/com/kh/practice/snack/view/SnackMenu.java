package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		
		System.out.print("���� : ");
		String strKind = sc.next();
		System.out.print("�̸� : ");
		String strName = sc.next();
		System.out.print("�� : ");
		String strFlavor = sc.next();
		System.out.print("���� : ");
		int strNumOf = sc.nextInt();
		System.out.print("���� : ");
		int strPrice = sc.nextInt();
		
		System.out.println(scr.saveData(strKind, strName, strFlavor, strNumOf, strPrice));
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		String checkInformation = sc.next();
		
		if(checkInformation.equals("y")) {
			System.out.println(scr.confirmData()); 
		} else {
			
		}
	}
}

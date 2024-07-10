package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		boolean bflag = false;
		
		while(true) {
			if(bflag) break;
			
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				bflag = true;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		System.out.println("��ū ó�� �� ���� : " + tc.afterToken(str));		
		System.out.println("��ū ó�� �� ���� : " + tc.afterToken(str).length());		
		System.out.println("��� �빮�ڷ� ��ȯ : " + tc.afterToken(str).toUpperCase()); 			
	}
	
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("ù ���� �빮�� : " + tc.firstCap(input));
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char findInput = sc.next().charAt(0);
		System.out.println(findInput + " ���ڰ� �� ���� : " + tc.findChar(input, findInput));
	}
}

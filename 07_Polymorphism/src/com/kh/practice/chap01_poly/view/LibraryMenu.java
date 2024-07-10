package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		boolean bflag = false;
		
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);

		lc.insertMember(new Member(name, age, gender, 0));
		
		while(true) {
			System.out.println();
			if(bflag) break;
			
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				System.out.println(lc.myInfo().toString());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				bflag = true;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				break;
			}
		}

	}
	
	public void selectAll() {
		Book[] bookList = lc.selectAll();
		
		int count = 0;
		for(Book book : bookList) {
			System.out.printf("%d�� ���� : %s \n", count++, book.toString());
		}
	}
	
	public void searchBook() {
		System.out.println();
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		Book[] bookList = lc.searchBook(keyword);
		
		int count = 0;
		for(Book book : bookList) {
			if(book == null) continue;
			System.out.println(book.toString());
		}
	}
	
	public void rentBook() {
		System.out.println();
		selectAll();
		System.out.printf("�뿩�� ���� ��ȣ ���� : ");
		int num = sc.nextInt();
		int result = lc.rentBook(num);
		
		switch (result) {
		case 0:
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
			break;
		case 1:
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
			break;
		case 2:
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���");
			break;
		default:
			break;
		}
	}
}

package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		while (true) {
			System.out.println();
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ ���� : ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}
	}

	public void insertBook() {
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		int categoryNum = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();

		String category = "";
		switch (categoryNum) {
		case 1:
			category = "�ι�";
			break;
		case 2:
			category = "����";
			break;
		case 3:
			category = "�ܱ���";
			break;
		case 4:
			category = "��Ÿ";
			break;
		default:
			category = "��Ÿ";
			break;
		}

		bc.insertBook(new Book(title, author, category, price));
	}

	public void selectList() {
		System.out.println("===== ���� ��ü ��ȸ =====");
		
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(Book b : bookList) {
				System.out.println(b.toString());
			}
		}
	}

	public void searchBook() {
		System.out.println("===== ���� �˻� =====");
		System.out.print("�˻� Ű���� : ");
		String str = sc.nextLine();
		
		ArrayList<Book> bookList = bc.searchBook(str);
		
		if(bookList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(Book b : bookList) {
				System.out.println(b.toString()); 
			}
		}
	}

	public void deleteBook() {
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String author = sc.nextLine();
		
		Book b = bc.deleteBook(title, author);
		
		if(b != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");			
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");			
		}
	}

	public void ascBook() {
		if(bc.ascBook() == 1) {			
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
	}
}
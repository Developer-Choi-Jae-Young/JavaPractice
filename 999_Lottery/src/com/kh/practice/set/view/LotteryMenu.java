package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH ��÷ ���α׷� ==========");
		while(true) {
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			
			switch (num) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("���α׷� ����.");
				return;

			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}
	}
	
	public void insertObject( ) {
		System.out.print("�߰��� ��÷ ��� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int count = 0;
		while(count < num) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();
			if(lc.insertObject(new Lottery(name, phone))) {
				count++;
			} else {
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
			}
			System.out.println();
		}
		
		System.out.println(count + "�� �߰� �Ϸ�Ǿ����ϴ�");
	}
	
	public void deleteObject( ) {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		if(lc.deleteObject(new Lottery(name, phone))) {
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
	
	public void winObject() {
		System.out.println(lc.winObject());
	}
	
	public void sortedWinObject() {
		Iterator<Lottery> it = lc.sortedWinObject().iterator();
		while(it.hasNext()) {
			Lottery lottery = it.next();
			System.out.println(lottery.toString());
		}
	}
	
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		if(lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		} else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
	}
}
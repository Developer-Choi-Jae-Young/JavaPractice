package com.kh.practice.map.view;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
		System.out.println("========== KH ����Ʈ ==========");
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ ���� : ");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				break;
			case 3:
				sameName();
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

	public void memberMenu() {
		while(true) {
			System.out.println("******* ȸ�� �޴� *******");
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.println();
			System.out.print("�޴� ��ȣ ���� : ");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}
	}

	public void joinMembership() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			if(mc.joinMembership(id, new Member(password, name))) {
				System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
				return;
			} else {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void logIn() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			String name = mc.logIn(id, password); 
			if(name != null) {
				System.out.println(name + "��, ȯ���մϴ�!");
				break;
			} else {
				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		memberMenu();
	}

	public void changePassword() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("���� ��й�ȣ : ");
			String oldPassword = sc.nextLine();
			System.out.print("���ο� ��й�ȣ : ");
			String newPassword = sc.nextLine();
			if(mc.changePassword(id, oldPassword, newPassword)) {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
				return;
			} else {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void changeName() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			
			if(name != null) {
				System.out.println("���� ������ �̸� : " + name);
				
				System.out.print("������ �̸� : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				
				System.out.println("�̸� ���濡 �����Ͽ����ϴ�.");
				return;
			} else {
				System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void sameName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		TreeMap<String, String> result = mc.sameName(name);
		
		if(result.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(Entry<String, String> entry :result.entrySet()) {
				System.out.println(entry.getValue() + "-" + entry.getKey());
			}
		}
	}
}
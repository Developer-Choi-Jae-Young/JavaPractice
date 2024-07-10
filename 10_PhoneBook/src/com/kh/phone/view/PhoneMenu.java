package com.kh.phone.view;

import java.util.Scanner;

import com.kh.phone.control.PhoneBookControl;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneMenu {
	private Scanner sc = new Scanner(System.in);
	private PhoneBookControl pbc = new PhoneBookControl();
	private PhoneBook[] phoneBookList;

	public PhoneMenu() {
		pbc.makeFile(PhoneBookControl.FILE_NAME);
		phoneBookList = pbc.readFile(PhoneBookControl.FILE_NAME);
	}

	public void mainMenu() {
		while (true) {
			System.out.println("1. ��ȭ��ȣ �߰�");
			System.out.println("2. ��ȭ��ȣ ����");
			System.out.println("3. ��ȭ��ȣ ����");
			System.out.println("4. ��ȭ��ȣ ����");
			System.out.println("9. ���α׷� ����");

			System.out.print("�޴� �Է� : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (num) {
			case 1:
				insertPhoneInfo();
				break;
			case 2:
				showPhoneInfo();
				break;
			case 3:
				deletePhoneInfo();
				break;
			case 4:
				updatePhoneInfo();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �ѹ� Ȯ�����ּ���.");
				break;
			}
			System.out.println();
		}
	}

	public void insertPhoneInfo() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();
		System.out.print("�Ҽ� : ");
		String belong = sc.nextLine();
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		System.out.print("�޸� : ");
		String memo = sc.nextLine();
		phoneBookList[pbc.getCurrentPhoneListCount()] = new PhoneBook(name, phone, belong, email, memo);
		pbc.wrtieFile(PhoneBookControl.FILE_NAME, phoneBookList);

		System.out.println("��ȭ��ȣ�� �߰��Ͽ����ϴ�.");
	}

	public void showPhoneInfo() {
		int count = 0;
		phoneBookList = pbc.readFile(PhoneBookControl.FILE_NAME);
		for (PhoneBook pb : phoneBookList) {
			if (pbc.getCurrentPhoneListCount() > count) {
				System.out.println("[" + count + "]" + pb.toString());
				count++;
			}
		}
	}

	public void deletePhoneInfo() {
		showPhoneInfo();
		System.out.print("������ ��ȣ�� �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		if (num > pbc.getCurrentPhoneListCount()) {
			System.out.println("���� �����Դϴ�. Ȯ���� �ٽ� �Է����ּ���.");
		} else {
			pbc.deletePhone(num);
		}
	}

	public void updatePhoneInfo() {
		showPhoneInfo();
		System.out.print("������ ��ȣ�� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		System.out.println();
		
		if (num > pbc.getCurrentPhoneListCount()) {
			System.out.println("���� �����Դϴ�. Ȯ���� �ٽ� �Է����ּ���.");
		} else {
			boolean bflag = false;
			
			while(true) {
				if(bflag) break;
				
				System.out.println("1. �̸�");
				System.out.println("2. �޸�");
				System.out.println("3. ��ȭ��ȣ");
				System.out.println("4. �̸���");
				System.out.println("5. �Ҽ�");
				System.out.println("9. ���ư���");
				System.out.print("�޴� ���� : ");
				int menu = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch (menu) {
				case 1:
					System.out.print("�ٲ� �̸� : ");
					String name = sc.nextLine();
					pbc.updatePhoneName(num, name);
					break;
				case 2:
					System.out.print("�ٲ� �޸� : ");
					String memo = sc.nextLine();
					pbc.updatePhoneMemo(num, memo);
					break;
				case 3:
					System.out.print("�ٲ� ��ȭ��ȣ : ");
					String phone = sc.nextLine();
					pbc.updatePhoneInfo(num, phone);
					break;
				case 4:
					System.out.print("�ٲ� �̸��� : ");
					String email = sc.nextLine();
					pbc.updatePhoneEmail(num, email);
					break;
				case 5:
					System.out.print("�ٲ� �Ҽ� : ");
					String belong = sc.nextLine();
					pbc.updatePhoneBelong(num, belong);
					break;
				case 9:
					bflag = true;
					System.out.println("�� �޴��� ���ư��ϴ�.");
					break;
				default:
					break;
				}
				System.out.println();
			}
		}
	}
}
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
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 보기");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 수정");
			System.out.println("9. 프로그램 종료");

			System.out.print("메뉴 입력 : ");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 한번 확인해주세요.");
				break;
			}
			System.out.println();
		}
	}

	public void insertPhoneInfo() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("소속 : ");
		String belong = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("메모 : ");
		String memo = sc.nextLine();
		phoneBookList[pbc.getCurrentPhoneListCount()] = new PhoneBook(name, phone, belong, email, memo);
		pbc.wrtieFile(PhoneBookControl.FILE_NAME, phoneBookList);

		System.out.println("전화번호를 추가하였습니다.");
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
		System.out.print("삭제할 번호를 입력하시오 : ");
		int num = sc.nextInt();

		if (num > pbc.getCurrentPhoneListCount()) {
			System.out.println("없는 정보입니다. 확인후 다시 입력해주세요.");
		} else {
			pbc.deletePhone(num);
		}
	}

	public void updatePhoneInfo() {
		showPhoneInfo();
		System.out.print("수정할 번호를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println();
		
		if (num > pbc.getCurrentPhoneListCount()) {
			System.out.println("없는 정보입니다. 확인후 다시 입력해주세요.");
		} else {
			boolean bflag = false;
			
			while(true) {
				if(bflag) break;
				
				System.out.println("1. 이름");
				System.out.println("2. 메모");
				System.out.println("3. 전화번호");
				System.out.println("4. 이메일");
				System.out.println("5. 소속");
				System.out.println("9. 돌아가기");
				System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch (menu) {
				case 1:
					System.out.print("바꿀 이름 : ");
					String name = sc.nextLine();
					pbc.updatePhoneName(num, name);
					break;
				case 2:
					System.out.print("바꿀 메모 : ");
					String memo = sc.nextLine();
					pbc.updatePhoneMemo(num, memo);
					break;
				case 3:
					System.out.print("바꿀 전화번호 : ");
					String phone = sc.nextLine();
					pbc.updatePhoneInfo(num, phone);
					break;
				case 4:
					System.out.print("바꿀 이메일 : ");
					String email = sc.nextLine();
					pbc.updatePhoneEmail(num, email);
					break;
				case 5:
					System.out.print("바꿀 소속 : ");
					String belong = sc.nextLine();
					pbc.updatePhoneBelong(num, belong);
					break;
				case 9:
					bflag = true;
					System.out.println("전 메뉴로 돌아갑니다.");
					break;
				default:
					break;
				}
				System.out.println();
			}
		}
	}
}

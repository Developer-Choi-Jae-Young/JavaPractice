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
		System.out.println("========== KH 사이트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			
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
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
		}
	}

	public void memberMenu() {
		while(true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.println();
			System.out.print("메뉴 번호 선택 : ");
			
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
				System.out.println("로그아웃 되었습니다.");
			return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
		}
	}

	public void joinMembership() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			if(mc.joinMembership(id, new Member(password, name))) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				return;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}

	public void logIn() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			String name = mc.logIn(id, password); 
			if(name != null) {
				System.out.println(name + "님, 환영합니다!");
				break;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
		
		memberMenu();
	}

	public void changePassword() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPassword = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPassword = sc.nextLine();
			if(mc.changePassword(id, oldPassword, newPassword)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				return;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changeName() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			
			if(name != null) {
				System.out.println("현재 설정된 이름 : " + name);
				
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				
				System.out.println("이름 변경에 성공하였습니다.");
				return;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		TreeMap<String, String> result = mc.sameName(name);
		
		if(result.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Entry<String, String> entry :result.entrySet()) {
				System.out.println(entry.getValue() + "-" + entry.getKey());
			}
		}
	}
}

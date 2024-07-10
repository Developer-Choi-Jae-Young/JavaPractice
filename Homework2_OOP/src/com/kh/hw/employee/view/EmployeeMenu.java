package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		boolean bflag = false;

		while (true) {
			if (bflag)
				break;

			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int munuNum = sc.nextInt();

			switch (munuNum) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				bflag = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
		}

	}

	public void insertEmp() {
		while (true) {
			System.out.print("사원 번호 : ");
			int num = sc.nextInt();
			System.out.print("사원 이름 : ");
			String name = sc.next();
			System.out.print("사원 성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("전화 번호 : ");
			String phone = sc.next();
			System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
			char info = sc.next().charAt(0);

			if (info == 'y' || info == 'y') {
				System.out.print("사원 부서 : ");
				String dept = sc.next();
				System.out.print("사원 연봉 : ");
				int salary = sc.nextInt();
				System.out.print("사원 보너스율  : ");
				double bonus = sc.nextDouble();

				ec.add(num, name, gender, phone, dept, salary, bonus, ec.getCurrentIndex());
			} else {
				ec.add(num, name, gender, phone, ec.getCurrentIndex());
			}

			System.out.print("사원 추가를 더 하시겠습니까?(y/n) : ");
			char addinfo = sc.next().charAt(0);

			if (addinfo == 'n' || addinfo == 'N') {
				break;
			}
		}
	}

	public void updateEmp() {
		// System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.print("수정할 사원의 이름을 입력해주세요. : ");
		String empName = sc.next();
		int index = ec.getCurrentIndex(empName);

		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			System.out.print("수정할 전화번호 : ");
			String phone = sc.next();
			ec.modify(phone, index);
			break;
		case 2:
			System.out.print("수정할 사원 연봉 : ");
			int salary = sc.nextInt();
			ec.modify(salary, index);
			break;
		case 3:
			System.out.print("수정할 보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus, index);
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void deleteEmp() {
		System.out.print("삭제할 직원을 입력해주세요. : ");
		String empName = sc.next();
		int index = ec.getCurrentIndex(empName);

		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char info = sc.next().charAt(0);

		if (info == 'y' || info == 'y') {
			if (ec.remove(index) == null) {
				System.out.println("데이터 삭제에 성공하였습니다.");
			} else {
				System.out.println("데이터 삭제에 실패하였습니다.");
			}
		} else {
			System.out.println("삭제 취소를 하였습니다.");
		}
	}

	public void printEmp() {
		int index = ec.getCurrentIndex();

		if (index == 0) {
			if (ec.inform(index) == null) {
				System.out.println("사원 데이터가 없습니다.");
			} else {
				System.out.println(ec.inform(index));
			}
		} else {
			for (int i = 0; i < index; i++) {
				if (ec.inform(i) == null) {
					System.out.println("사원 데이터가 없습니다.");
				} else {
					System.out.println(ec.inform(i));
				}
			}
		}
	}
}

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

			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				bflag = true;
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}

	}

	public void insertEmp() {
		while (true) {
			System.out.print("��� ��ȣ : ");
			int num = sc.nextInt();
			System.out.print("��� �̸� : ");
			String name = sc.next();
			System.out.print("��� ���� : ");
			char gender = sc.next().charAt(0);
			System.out.print("��ȭ ��ȣ : ");
			String phone = sc.next();
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			char info = sc.next().charAt(0);

			if (info == 'y' || info == 'y') {
				System.out.print("��� �μ� : ");
				String dept = sc.next();
				System.out.print("��� ���� : ");
				int salary = sc.nextInt();
				System.out.print("��� ���ʽ���  : ");
				double bonus = sc.nextDouble();

				ec.add(num, name, gender, phone, dept, salary, bonus, ec.getCurrentIndex());
			} else {
				ec.add(num, name, gender, phone, ec.getCurrentIndex());
			}

			System.out.print("��� �߰��� �� �Ͻðڽ��ϱ�?(y/n) : ");
			char addinfo = sc.next().charAt(0);

			if (addinfo == 'n' || addinfo == 'N') {
				break;
			}
		}
	}

	public void updateEmp() {
		// System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
		System.out.print("������ ����� �̸��� �Է����ּ���. : ");
		String empName = sc.next();
		int index = ec.getCurrentIndex(empName);

		System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			System.out.print("������ ��ȭ��ȣ : ");
			String phone = sc.next();
			ec.modify(phone, index);
			break;
		case 2:
			System.out.print("������ ��� ���� : ");
			int salary = sc.nextInt();
			ec.modify(salary, index);
			break;
		case 3:
			System.out.print("������ ���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus, index);
			break;
		case 9:
			System.out.println("���θ޴��� ���ư��ϴ�.");
			break;

		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}

	public void deleteEmp() {
		System.out.print("������ ������ �Է����ּ���. : ");
		String empName = sc.next();
		int index = ec.getCurrentIndex(empName);

		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		char info = sc.next().charAt(0);

		if (info == 'y' || info == 'y') {
			if (ec.remove(index) == null) {
				System.out.println("������ ������ �����Ͽ����ϴ�.");
			} else {
				System.out.println("������ ������ �����Ͽ����ϴ�.");
			}
		} else {
			System.out.println("���� ��Ҹ� �Ͽ����ϴ�.");
		}
	}

	public void printEmp() {
		int index = ec.getCurrentIndex();

		if (index == 0) {
			if (ec.inform(index) == null) {
				System.out.println("��� �����Ͱ� �����ϴ�.");
			} else {
				System.out.println(ec.inform(index));
			}
		} else {
			for (int i = 0; i < index; i++) {
				if (ec.inform(i) == null) {
					System.out.println("��� �����Ͱ� �����ϴ�.");
				} else {
					System.out.println(ec.inform(i));
				}
			}
		}
	}
}

package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		boolean bflag = false;

		while (true) {
			if (bflag)
				break;

			System.out.println("===== ���� ���α׷� =====");
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 3:
				triangleMenu();
				bflag = true;
				break;
			case 4:
				squareMenu();
				bflag = true;
				break;
			case 9:
				System.out.println("���α׷� ����");
				bflag = true;
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
			/*
			 * if(menuNum == 3 ) { triangleMenu(); break; } else if(menuNum == 4) {
			 * squareMenu(); break; } else if(menuNum == 9) { System.out.println("���α׷� ����");
			 * break; }else { System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); }
			 */
		}
	}

	public void triangleMenu() {
		boolean bflag = false;

		final int TYPE = 3;

		while (true) {
			if (bflag)
				break;

			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				inputSize(TYPE, menuNum);
				break;
			case 2:
				inputSize(TYPE, menuNum);
				break;
			case 3:
				printlnformation(TYPE);
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				bflag = true;
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}

			/*
			 * if (menuNum == 1 || menuNum == 2 || menuNum == 3) { break; } else if (menuNum
			 * == 9) { System.out.println("�������� ���ư��ϴ�."); inputMenu(); break; } else {
			 * System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); }
			 */
		}
	}

	public void squareMenu() {
		boolean bflag = false;

		final int TYPE = 4;

		while (true) {
			if (bflag)
				break;

			System.out.println("===== �簢�� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				inputSize(TYPE, menuNum);
				break;
			case 2:
				inputSize(TYPE, menuNum);
				break;
			case 3:
				inputSize(TYPE, menuNum);
				break;
			case 4:
				printlnformation(TYPE);
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				bflag = true;
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}

			/*
			 * if (menuNum == 1 || menuNum == 2 || menuNum == 3) { break; } else if (menuNum
			 * == 9) { System.out.println("�������� ���ư��ϴ�."); inputMenu(); break; } else {
			 * System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); }
			 */
		}
	}

	public void inputSize(int type, int menuNum) {
		if (type == 3) {
			switch (menuNum) {
			case 1:
				System.out.print("���� : ");
				double height = sc.nextDouble();
				System.out.print("�ʺ� : ");
				double width = sc.nextDouble();
				double result = tc.calcArea(height, width);
				System.out.println("�ﰢ�� ���� : " + result);
				break;
			case 2:
				System.out.print("������ �Է��ϼ��� : ");
				String strColor = sc.next();
				tc.paintColor(strColor);
				System.out.println("���� �����Ǿ����ϴ�");
				break;
			default:
				break;
			}
		} else {
			switch (menuNum) {
			case 1:
				System.out.print("���� : ");
				double height = sc.nextDouble();
				System.out.print("�ʺ� : ");
				double width = sc.nextDouble();
				double result = scr.calcPerimeter(height, width);
				System.out.println("�簢�� �ѷ� : " + result);
				break;
			case 2:
				System.out.print("���� : ");
				height = sc.nextDouble();
				System.out.print("�ʺ� : ");
				width = sc.nextDouble();
				result = scr.calcArea(height, width);
				System.out.println("�簢�� ���� : " + result);
				break;
			case 3:
				System.out.print("������ �Է��ϼ��� : ");
				String strColor = sc.next();
				scr.paintColor(strColor);
				System.out.println("���� �����Ǿ����ϴ�");
				break;

			default:
				break;
			}
		}
	}

	public void printlnformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		} else  {
			System.out.println(scr.print());
		}
	}
}

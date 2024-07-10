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

			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("프로그램 종료");
				bflag = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
			/*
			 * if(menuNum == 3 ) { triangleMenu(); break; } else if(menuNum == 4) {
			 * squareMenu(); break; } else if(menuNum == 9) { System.out.println("프로그램 종료");
			 * break; }else { System.out.println("잘못된 번호입니다. 다시 입력해주세요."); }
			 */
		}
	}

	public void triangleMenu() {
		boolean bflag = false;

		final int TYPE = 3;

		while (true) {
			if (bflag)
				break;

			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				bflag = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}

			/*
			 * if (menuNum == 1 || menuNum == 2 || menuNum == 3) { break; } else if (menuNum
			 * == 9) { System.out.println("메인으로 돌아갑니다."); inputMenu(); break; } else {
			 * System.out.println("잘못된 번호입니다. 다시 입력해주세요."); }
			 */
		}
	}

	public void squareMenu() {
		boolean bflag = false;

		final int TYPE = 4;

		while (true) {
			if (bflag)
				break;

			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				bflag = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}

			/*
			 * if (menuNum == 1 || menuNum == 2 || menuNum == 3) { break; } else if (menuNum
			 * == 9) { System.out.println("메인으로 돌아갑니다."); inputMenu(); break; } else {
			 * System.out.println("잘못된 번호입니다. 다시 입력해주세요."); }
			 */
		}
	}

	public void inputSize(int type, int menuNum) {
		if (type == 3) {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double result = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " + result);
				break;
			case 2:
				System.out.print("색깔을 입력하세요 : ");
				String strColor = sc.next();
				tc.paintColor(strColor);
				System.out.println("색이 수정되었습니다");
				break;
			default:
				break;
			}
		} else {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double result = scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : " + result);
				break;
			case 2:
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				result = scr.calcArea(height, width);
				System.out.println("사각형 면적 : " + result);
				break;
			case 3:
				System.out.print("색깔을 입력하세요 : ");
				String strColor = sc.next();
				scr.paintColor(strColor);
				System.out.println("색이 수정되었습니다");
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

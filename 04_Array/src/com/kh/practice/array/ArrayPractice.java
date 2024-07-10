package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int size = 10;
		int[] num = new int[size];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void practice2() {
		int size = 10;
		int[] num = new int[size];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}

	public void practice3() {
		System.out.print("양의 정수 : ");

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] num = new int[size];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void practice4() {
		String[] str = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.print(str[1]);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char input = sc.next().charAt(0);

		char[] c = new char[str.length()];

		for (int i = 0; i < c.length; i++) {
			c[i] = str.charAt(i);
		}

		String output = str + "에 " + input + "가 존재하는 위치(인덱스) : ";
		int count = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == input) {
				output += i + " ";
				count++;
			}
		}

		System.out.println(output);
		System.out.print("i 개수 : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num > arr.length) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(arr[num]);
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arrNum = new int[num];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arrNum[i] = sc.nextInt();

			sum += arrNum[i];
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arrNum[i] + " ");
		}

		System.out.print("\n총 합 : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			int[] arrNum;

			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				arrNum = new int[num];
				int cnt = 1;

				for (int i = 0; i < num; i++) {
					if (i < num / 2) {
						arrNum[i] = cnt++;
					} else {
						arrNum[i] = cnt--;
					}
				}

				for (int i = 0; i < num; i++) {
					System.out.print(arrNum[i]);
					if (i != (num - 1))
						System.out.print(", ");
				}

				break;
			}
		}
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[10000];

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		int count = 0;

		while (true) {

			for (int i = 0; i < num; i++) {
				System.out.print(count + "번째 문자열 : ");
				String str = sc.nextLine();
				arr[count] = str;
				count++;
			}

			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char c = sc.next().charAt(0);

			if (c == 'N' || c == 'n') {
				break;
			} else if (c == 'Y' || c == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				num = sc.nextInt();
				sc.nextLine();
			} else {
				System.out.print("잘못된 키를 입력하여 종료 합니다.");
				break;
			}
		}

		System.out.print("[");

		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]);
			if (i != (count - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("]");
	}
}

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
		System.out.print("���� ���� : ");

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
		String[] str = { "���", "��", "����", "������", "����" };

		System.out.print(str[1]);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.next();
		System.out.print("���� : ");
		char input = sc.next().charAt(0);

		char[] c = new char[str.length()];

		for (int i = 0; i < c.length; i++) {
			c[i] = str.charAt(i);
		}

		String output = str + "�� " + input + "�� �����ϴ� ��ġ(�ε���) : ";
		int count = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == input) {
				output += i + " ";
				count++;
			}
		}

		System.out.println(output);
		System.out.print("i ���� : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "��", "ȭ", "��", "��", "��", "��", "��" };

		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num > arr.length) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.println(arr[num]);
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		int[] arrNum = new int[num];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arrNum[i] = sc.nextInt();

			sum += arrNum[i];
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arrNum[i] + " ");
		}

		System.out.print("\n�� �� : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();

			int[] arrNum;

			if (num < 3 || num % 2 == 0) {
				System.out.println("�ٽ� �Է��ϼ���.");
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

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();

		int count = 0;

		while (true) {

			for (int i = 0; i < num; i++) {
				System.out.print(count + "��° ���ڿ� : ");
				String str = sc.nextLine();
				arr[count] = str;
				count++;
			}

			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char c = sc.next().charAt(0);

			if (c == 'N' || c == 'n') {
				break;
			} else if (c == 'Y' || c == 'y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				num = sc.nextInt();
				sc.nextLine();
			} else {
				System.out.print("�߸��� Ű�� �Է��Ͽ� ���� �մϴ�.");
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

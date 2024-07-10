package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = 4 * i + (j + 1);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void practice3() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = 4 * 4 - (j + (i * 4));
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void practice4_1() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				int lastRow = arr.length - 1;
				int lastCol = arr[i].length - 1;

				if (i != lastRow && j != lastCol) {
					arr[i][j] = (int) (Math.random() * 10) + 1;
				}

				if (i < lastRow) {
					arr[lastRow][j] += arr[i][j];
				}

				if (j < lastCol) {
					arr[i][lastCol] += arr[i][j];
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;
			}
		}

		int rowSum, colSum, allSum = 0;

		for (int i = 0; i < 3; i++) {
			rowSum = 0;
			for (int j = 0; j < 3; j++) {
				rowSum += arr[i][j];
			}
			arr[i][3] = rowSum;
		}

		for (int i = 0; i < 3; i++) {
			colSum = 0;
			for (int j = 0; j < 3; j++) {
				colSum += arr[j][i];
			}
			arr[3][i] = colSum;
		}

		for (int i = 0; i < 3; i++) {
			allSum += arr[i][3] + arr[3][i];
		}

		arr[3][3] = allSum;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		int row, col;

		while (true) {
			System.out.print("��ũ�� : ");
			row = sc.nextInt();

			System.out.print("��ũ�� : ");
			col = sc.nextInt();

			if (row > 10 || col > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			} else {
				break;
			}
		}

		char[][] arr = new char[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = (char) (65 + (int) (Math.random() * 25));
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.print("\n");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		int[] arrCol = new int[row];
		char[][] arrData = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "���� �� ũ�� : ");
			int input = sc.nextInt();
			arrCol[i] = input;
			arrData[i] = new char[input];
		}

		int cnt = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arrCol[i]; j++) {
				arrData[i][j] = (char) (97 + cnt);
				cnt++;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arrCol[i]; j++) {
				System.out.print(arrData[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public void practice8() {
		String[] arrString = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] doubleArrString1 = new String[3][2];
		String[][] doubleArrString2 = new String[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				doubleArrString1[i][j] = arrString[(2 * i) + j];

				doubleArrString2[i][j] = arrString[(2 * 3) + (2 * i) + j];
			}
		}

		System.out.println("== 1�д� ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(doubleArrString1[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("== 2�д� ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(doubleArrString2[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	public void practice9() {
		String[] arrString = { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����" };

		String[][] doubleArrString1 = new String[3][2];
		String[][] doubleArrString2 = new String[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				doubleArrString1[i][j] = arrString[(2 * i) + j];

				doubleArrString2[i][j] = arrString[(2 * 3) + (2 * i) + j];
			}
		}

		System.out.println("== 1�д� ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(doubleArrString1[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("== 2�д� ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(doubleArrString2[i][j] + "\t");
			}
			System.out.print("\n");
		}

		System.out.println("============================");
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");

		Scanner sc = new Scanner(System.in);
		String strName = sc.next();

		int output1 = 0;
		String output2 = "", output3 = "";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (doubleArrString1[i][j].equals(strName)) {
					output1 = 1;
					switch (i) {
					case 0:
						output2 = "ù";
						break;
					case 1:
						output2 = "��";
						break;
					case 2:
						output2 = "��";
						break;
					default:
						break;
					}
					if (j == 0) {
						output3 = "��";
					} else {
						output3 = "����";
					}
				} else if (doubleArrString2[i][j].equals(strName)) {
					output1 = 2;
					switch (i) {
					case 0:
						output2 = "ù";
						break;
					case 1:
						output2 = "��";
						break;
					case 2:
						output2 = "��";
						break;
					default:
						break;
					}
					if (j == 0) {
						output3 = "��";
					} else {
						output3 = "����";
					}
				}
			}
		}

		System.out.printf("�˻��Ͻ� %s �л��� %d�д� %s ��° %s���ٿ� �ֽ��ϴ�.", strName, output1, output2, output3);
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		String[][] arrString = new String[6][6];
		
		System.out.print("�� �ε��� �Է� : ");
		int row = sc.nextInt();
		System.out.print("�� �ε��� �Է� : ");
		int col = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 && j == 0) {
					arrString[i][j] = " ";
				} else {
					if (i == 0) {
						arrString[i][j] = (j - 1) + " ";
					} else if (j == 0) {
						arrString[i][j] = Integer.toString((i - 1));
					} else if (i == (row + 1) && j == (col + 1)) {
						arrString[i][j] = "X ";
					} else {
						arrString[i][j] = "  ";
					}
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(arrString[i][j]);
			}
			System.out.print("\n");
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		String[][] arrString = new String[6][6];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 && j == 0) {
					arrString[i][j] = " ";
				} else {
					if (i == 0) {
						arrString[i][j] = (j - 1) + " ";
					} else if (j == 0) {
						arrString[i][j] = Integer.toString((i - 1));
					} else {
						arrString[i][j] = "  ";
					}
				}
			}
		}
		
		while (true) {
			System.out.print("�� �ε��� �Է� : ");
			int row = sc.nextInt();
			if(row == 99) {
				System.out.print("���α׷� ����");
				break;
			}
			System.out.print("�� �ε��� �Է� : ");
			int col = sc.nextInt();

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					 if (i == (row + 1) && j == (col + 1)) {
							arrString[i][j] = "X ";
						}
					}
				}
			
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					System.out.print(arrString[i][j]);
				}
				System.out.print("\n");
			}
		}
	}
}

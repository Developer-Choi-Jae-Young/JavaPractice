package com.kh.practice.file.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		boolean bflag = false;

		while (true) {
			if (bflag)
				break;

			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				bflag = true;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}

	public void fileSave() {
		boolean bflag = false;
		StringBuilder sb = new StringBuilder();
		while (true) {
			if (bflag) break;
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String str = sc.nextLine();

			if (str.equals("ex��it")) {
				boolean stopFlag = false;
				
				while(true) {
					if(stopFlag) break;
					System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
					String fileName = sc.nextLine();
					if (!fc.checkName(fileName)) {
						try {
							fc.fileSave(fileName, sb);
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						stopFlag = true;
					} else {
						System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�? (y/n) : ");
						char answer = sc.nextLine().charAt(0);
						
						if(answer == 'y' || answer == 'Y') {
							try {
								fc.fileSave(fileName, sb);
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
							stopFlag = true;
						}
					}
				}
				bflag = true;
			}
			
			sb.append(str + "\n");
		}
	}

	public void fileOpen() {
		System.out.print("�� ���� �� : ");
		String str = sc.nextLine();
		
		if(fc.checkName(str)) {
			try {
				System.out.println(fc.fileOpen(str));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("���� �����Դϴ�.");
		}
		
	}

	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		boolean bflag = false;
		
		if(fc.checkName(str)) {
			while (true) {
				if(bflag) break;
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String content = sc.nextLine();
				
				if(content.equals("ex��it")) {
					try {
						fc.fileEdit(str, sb);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					bflag = true;
				}
				
				sb.append(content + "\n");
			}
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}
}

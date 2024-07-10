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
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

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
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void fileSave() {
		boolean bflag = false;
		StringBuilder sb = new StringBuilder();
		while (true) {
			if (bflag) break;
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();

			if (str.equals("ex끝it")) {
				boolean stopFlag = false;
				
				while(true) {
					if(stopFlag) break;
					System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
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
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
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
		System.out.print("열 파일 명 : ");
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
			System.out.println("없는 파일입니다.");
		}
		
	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		boolean bflag = false;
		
		if(fc.checkName(str)) {
			while (true) {
				if(bflag) break;
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String content = sc.nextLine();
				
				if(content.equals("ex끝it")) {
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
			System.out.println("없는 파일입니다.");
		}
	}
}

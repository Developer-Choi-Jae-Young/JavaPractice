package com.kh.practice1;

//Scanner Ŭ���� import : �ܺ� ����� Ŭ������ ��� �� �� ����
import java.util.Scanner;

public class VariablePractice1 {
	//Q. �̸�, ����, ����, Ű�� ����ڿ��� �Է¹޾�
	//	 ������ ���� ������ ��� ����ϼ���.
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		
		// "�̸��� �Է��ϼ��� : " ���� ���
		// �ٹٲ� ó������ �ʱ� ���� print �޼ҵ� ���
		System.out.print("�̸��� �Է��ϼ��� : ");
		
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		
		String gender = sc.nextLine();
		
        System.out.print("���̸� �Է��ϼ��� : ");
		
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		
		double height = sc.nextDouble();
		
		//System.out.println("Ű�� " + height + "cm�� " + age + "�� " + gender + "�� " + name +"�� �ݰ����ϴ�^^" );
		System.out.printf("Ű�� %.1fcm�̰� %d�� \n%s���� %s�� �ݰ����ϴ�^^", height,age,gender,name);
		
		/* int a = 12;
		 double d = 3.3;
		 int result = a + (int)d;
		 System.out.println(result);*/
		

	}

}

package com.cjy.project.test;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		/*Car[] c = new Car[2];
		c[0] = new BMW(4, "�¿���", "P", "BMW");
		c[1] = new Hyndai(4, "SUV", "P", "����");
		
		for(Car cc : c) {
			cc.info();
		}*/
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int len = sc.nextInt();
		
		
		for(int i = 0; i < len; i++) {
			int a = (int)(Math.random() * len) + 1;
			list.add(a);
		}
		
		for(int ii : list) {
			System.out.println(ii);
		}
	
		/** ���
        �̰��� BMW�Դϴ�.
		�̰��� �����Դϴ�.
        **/
	}
}
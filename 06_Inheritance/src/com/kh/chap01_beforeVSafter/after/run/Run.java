package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.Product;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		Product[] p = new Product[5];
		
		int count = 0;
		p[count++] = new Desktop("�Ｚ", "���ڵ�", "���۾��̿�������Ʈ��ĸ����Ʈ��", 650000000, true);
		p[count++] = new SmartPhone("�Ｚ", "���ڵ�", "���۾��̿�������Ʈ��ĸ����Ʈ��", 650000000, "������");
		p[count++] = new Tv("�Ｚ", "���ڵ�", "���۾��̿�������Ʈ��ĸ����Ʈ��", 650000000, 65);
		p[count++] = new Desktop("�Ｚ", "���ڵ�", "���۾��̿�������Ʈ��ĸ����Ʈ��", 650000000, true);
		p[count++] = new Tv("�Ｚ", "���ڵ�", "���۾��̿�������Ʈ��ĸ����Ʈ��", 650000000, 30);
		
		for(Product pp : p) {			
			System.out.println(pp.information());
		}
	}

}

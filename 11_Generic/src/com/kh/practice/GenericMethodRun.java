package com.kh.practice;

class DataClass02 {
	public <T> void test(Integer num) {
		T data;
		
		data = (T)num;
		System.out.println(data);
	}
	
	public <T> T test2(T data) {
		T t;
		t = data;
		return t;
	}
}

public class GenericMethodRun {

	public static void main(String[] args) {
		DataClass02 d1 = new DataClass02();
		d1.test(1234); 									//Ÿ���� ��������������, T --> Object
		d1.<Double>test(1234); 							//T --> Double
		System.out.println(d1.test2("�����ٶ󸶹ٻ�"));		//T --> �ڵ����� ����
		System.out.println(d1.<Double>test2(2.1));		//T --> Double
	}

}
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
		d1.test(1234); 									//타입을 지정하지않으면, T --> Object
		d1.<Double>test(1234); 							//T --> Double
		System.out.println(d1.test2("가나다라마바사"));		//T --> 자동으로 결정
		System.out.println(d1.<Double>test2(2.1));		//T --> Double
	}

}

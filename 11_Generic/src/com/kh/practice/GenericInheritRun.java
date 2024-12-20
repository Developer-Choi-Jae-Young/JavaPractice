package com.kh.practice;

class Parent<T> {
	T data;
}

class Child1 extends Parent {     		// class Child1 extends Parent -----> class Child1 extends Parent<Object>
	//Object data
}

class Child2 extends Parent<String> {	// class Child2 extends Parent<String> -----> class Child2 extends Parent<String>
	//String data
}

class Child3<K> extends Parent<K> {		// class Child3<K> extends Parent -----> class Child3<K> extends Parent<K>
	//K data
}

class Child4<M, N> extends Parent<M> {	// class Child4<M, N> extends Parent<M> -----> class Child4<M, N> extends Parent<M>
	N data2;
	//M data;
}

public class GenericInheritRun {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.data = "안녕하세요";
		System.out.println("[Child1] " + c1.data);
		c1.data = 1;
		System.out.println("[Child1] " + c1.data);
		c1.data = 2.3;
		System.out.println("[Child1] " + c1.data);
		
		Child2 c2 = new Child2();
		c2.data = "데이터";
		System.out.println("[Child2] " + c2.data);
		c2.data = "문자열만 가능";
		System.out.println("[Child2] " + c2.data);
		
		Child3<String> c3 = new Child3<>();
		c3.data = "안녕하세요";
		System.out.println("[Child3] " + c3.data);
		
		Child4<Integer, String> c4 = new Child4<>();
		c4.data = 1;
		c4.data2 = "문자열만 가능";
		System.out.println("[Child4] " + c4.data + ", " + c4.data2);
	}

}

package com.kh.practice.set;

public class Person {
	private String name;
	private int age;
	private int height;
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	public Person(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		String info = name + age + height;
		return info.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(this.name.equals(p.name) && this.age == p.age && this.height == p.height) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
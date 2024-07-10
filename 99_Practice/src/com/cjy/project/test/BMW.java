package com.cjy.project.test;

public class BMW extends Car{
	private String brand;
	
	public BMW(int door, String gear, String model, String brand) {
		super(door, gear, model);
		this.brand = brand;
	}
	
	public void info() {
		System.out.println("이것은 BMW입니다.");
	}
}

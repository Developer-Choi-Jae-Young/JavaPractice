package com.cjy.project.test;

public class Hyndai extends Car{
	private String brand;

	public Hyndai(int door, String gear, String model, String brand) {
		super(door, gear, model);
		this.brand = brand;
	}

	public void info() {
		System.out.println("이것은 현대입니다.");
	}
}

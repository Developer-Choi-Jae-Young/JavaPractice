package com.cjy.project.test;

public class Car {
	private int door;
	private String gear;
	private String model;
	
	public Car() {
		
	}
	
	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(int door, String gear, String model) {
		this.door = door;
		this.gear = gear;
		this.model = model;
	}

	public void powerOn() {
		System.out.println("�õ��ѱ�");
	}
	
	public void powerOff() {
		System.out.println("�õ�����");
	}
	
	public void accel() {
		System.out.println("�Ǽ����");
	}
	
	public void stop() {
		System.out.println("�극��ũ ���");
	}
	
	public void info( ) {
		System.out.println("�̰��� Car�Դϴ�.");
	}
}

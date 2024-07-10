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
		System.out.println("Ω√µøƒ—±‚");
	}
	
	public void powerOff() {
		System.out.println("Ω√µø≤Ù±‚");
	}
	
	public void accel() {
		System.out.println("æ«ºøπ‚±‚");
	}
	
	public void stop() {
		System.out.println("∫Í∑π¿Ã≈© π‚±‚");
	}
	
	public void info( ) {
		System.out.println("¿Ã∞Õ¿∫ Car¿‘¥œ¥Ÿ.");
	}
}

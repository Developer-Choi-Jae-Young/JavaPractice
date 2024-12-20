package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {
	}
	
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.phone);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery lott = (Lottery)obj;
			if(lott.getName().equals(this.getName()) && lott.getPhone().equals(this.getPhone())) {
				return true;
			}
		}
		
		return false;
	}
}

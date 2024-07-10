package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee[] e = new Employee[12404];
	private int currentIndex = 0;

	public int getCurrentIndex( ) {
		return this.currentIndex;
	}
	
	public int getCurrentIndex(String empName) {
		int returnValue = -1;
		
		for(int i = 0; i < currentIndex; i++) {
			if(e[i].getName().equals(empName)) {
				returnValue = i;
				break;
			}
		}
		return returnValue;
	}
	
	public void add(int empNo, String name, char gender, String phone, int index) {
		e[index] = new Employee(empNo, name, gender, phone);
		this.currentIndex++;
	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus, int index) {
		e[index] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
		this.currentIndex++;
	}

	public void modify(String phone, int index) {
		e[index].setPhone(phone);
	}

	public void modify(int salary, int index) {
		e[index].setSalary(salary);
	}
	
	public void modify(double bonus, int index) {
		e[index].setBonus(bonus);
	}
	
	public Employee remove(int index) {
		for(int i = index; i < currentIndex; i++ ) {
			e[i] = e[i + 1];
		}
		//e[index] = null;
		currentIndex--;
		if(currentIndex < 0) currentIndex = 0;
		return e[index];
	}
	
	public String inform(int index) {
		if(e[index] == null) {
			return null;
		} else {			
			return e[index].printEmployee();
		}
	}
}

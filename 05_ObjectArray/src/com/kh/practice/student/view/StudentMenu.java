package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== �л� ���� ��� ==========");
		for(Student s : ssm.printStudent()) {
			System.out.println(s.inform());
		}
		System.out.println("========== �л� ���� ��� ==========");
		double[] result = ssm.avgScore();
		int sum = (int)result[0];
		for(int i = 0; i < result.length; i++) {
			if(i == 0) {
				System.out.println("�л� ���� �հ� : " + sum);
			} else {
				System.out.println("�л� ���� ��� : " + result[1]);
			}
		}
		System.out.println("========== ���� ��� ��� ==========");
		for(Student s : ssm.printStudent()) {
			if(s.getScore() < StudentController.CUT_LINE) {
				System.out.println(s.getName() +"�� ����� ����Դϴ�.");
			} else {
				System.out.println(s.getName() +"�� ����Դϴ�.");
			}
		}
	}
}

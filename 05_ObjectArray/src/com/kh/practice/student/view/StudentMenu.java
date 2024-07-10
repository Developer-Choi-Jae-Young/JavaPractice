package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		for(Student s : ssm.printStudent()) {
			System.out.println(s.inform());
		}
		System.out.println("========== 학생 성적 출력 ==========");
		double[] result = ssm.avgScore();
		int sum = (int)result[0];
		for(int i = 0; i < result.length; i++) {
			if(i == 0) {
				System.out.println("학생 점수 합계 : " + sum);
			} else {
				System.out.println("학생 점수 평균 : " + result[1]);
			}
		}
		System.out.println("========== 성적 결과 출력 ==========");
		for(Student s : ssm.printStudent()) {
			if(s.getScore() < StudentController.CUT_LINE) {
				System.out.println(s.getName() +"은 재시험 대상입니다.");
			} else {
				System.out.println(s.getName() +"은 통과입니다.");
			}
		}
	}
}

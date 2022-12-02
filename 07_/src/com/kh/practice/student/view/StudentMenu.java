package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println(" ==== 학생 정보 출력 ==== ");
		for (int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}

		System.out.println(" ==== 학생 성적 출력 ==== ");
		System.out.println("총점 : " + (int) ssm.avgScore()[0]);
		System.out.println("평균 : " + ssm.avgScore()[1]);
		System.out.println(" ==== 학생 결과 출력 ==== ");
		ssm.printStudent();
		for (int i = 0; i < ssm.printStudent().length; i++) {
			if (ssm.printStudent()[i].getScore() < ssm.CUT_LINE) {
				System.out.printf("%s학생은 재시험 대상입니다. \n", ssm.printStudent()[i].getName());
			} else {
				System.out.printf("%s학생은 통과입니다.\n", ssm.printStudent()[i].getName());
			}
		}

	}

}

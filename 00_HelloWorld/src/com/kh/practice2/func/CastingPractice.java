package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	public void test() {
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.printf("총점 : %d \n", kor+eng+math);
		System.out.printf("평균 : %d", (kor+eng+math)/3);

}}

package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력:");
		int a = sc.nextInt();
		System.out.print("피연산자2 입력:");
		int b = sc.nextInt();
		System.out.print("연산자 입력:");
		sc.nextLine();
		char c = sc.nextLine().charAt(0);
		
		if (a>0 && b>0) {
			if (c=='+') {
				System.out.printf("%d %c %d = %d", a,c,b,(a+b));}
			else if (c=='-') {
				System.out.printf("%d %c %d = %d", a,c,b,(a-b));}
			else if (c == '*') {
				System.out.printf("%d %c %d = %d", a,c,b,(a*b));}
			else if (c=='/') {
				System.out.printf("%d %c %d = %.5f", a,c,b,(a/(double)b));}
			else if (c=='%') {
				System.out.printf("%d %c %d = %d", a,c,b,(a%b));}
			else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000 ~ 9999):");
		int a = sc.nextInt();
		
		if(a > 999 && a < 10000) {
			int first = a%10; // 일의 자리수
			int second = a/10%10; // 십의 자리수
			int third = a/100%10; // 백의 자리수
			int forth = a/1000%10; // 천의 자리수
			
			//중복값 처리하기
			if(first != second && first != third && first != forth && second != third &&
					second != third && third != forth) {
				System.out.println("생성 성공");
			}else {
				System.out.println("중복 값 있음");
			}
		}else {
			System.out.println("자리 수 안맞음");
		}
		
		
		
		
		
	}

}

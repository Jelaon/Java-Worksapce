package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	
	/* 연산자 = 괄호 필수!
	 * 비교연산자 (관계연산자)
	 * 두 개의 값을 가지고 비교
	 * 반환값: true, false
	 * > 나중에 특정 조건을 제시할 수 있는 조건문에서 많이 사용할 예정
	 * 
	 * 대소비교
	 * <, >, <=, >=
	 * 
	 * 일치함을 비교
	 * ==, !=
	 */
	
	public void method1() {
		int a= 10;
		int b= 25;
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		
		boolean result1 = (a==b);
		System.out.println(result1);
		System.out.println(a!=b);
		
		//산술연산 + 비교연산
		System.out.println(a-b < 0);
		
		//어떤 값을 2로 나눴을 때 나머지값이 0이면 짝수, 1이면 홀수
		
		System.out.println("a가 짝수입니까?"+ (a % 2 ==0));
		System.out.println("b가 짝수입니까?"+ (b % 2 !=1));
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력:");
		int num = sc.nextInt();
		
		System.out.println("사용자가 입력한 값은 양수입니까?"+(num>0));
		System.out.println("사용자가 입력한 값은 짝수입니까?"+(num%2==0));
		
		
	}

}

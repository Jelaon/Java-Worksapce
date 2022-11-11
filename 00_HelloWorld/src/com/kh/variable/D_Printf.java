package com.kh.variable;

public class D_Printf {
	
	/*
	 * System.out.println(출력하고자하는 값); > 자동줄바꿈
	 * System.out.print(출력하고자하는 값); > 줄바꿈X
	 * 
	 * System.out.printf("출력하고자하는 형식", 값, 값, 값 ...); > 줄바꿈X
	 * > f는 format(형식)을 의미
	 * > 형식에 맞춰서 값들이 출력됨
	 * > 문자열 안에 그 값이 들어갈 자리에 다음과 같은 형식으로 잡아줘야 함
	 * 
	 * [형식]
	 * %d 정수(demical) %f 실수(float) %c 문자(char) %s 문자열(string)
	 */

	
	
	
	public void printFtest() {
		// 정수 테스트
		int a = 10;
		int b = 20;
		
		// a : xx , b: xx 를 출력해보기
		// 1. println
		System.out.println("a: " + a +", b: " + b);
		// 2.printf
		System.out.printf("a: %d, b: %d \n", a, b);
		
		// 10+ 20 = 30 출력해보기
		// 1. println
		System.out.println(a +"+"+b+"="+(a+b));
		// 2.printf
		System.out.printf("%d+%d=%d \n", a, b, a+b);
	
		System.out.printf("%5d \n", a); // 5칸의 공간, 오른쪽 정렬
		System.out.printf("%-5d \n", a); // 5칸의 공간, 왼쪽 정렬
		
		// 실수 테스트
		double c = 4.27546789;
		System.out.printf("c: %f \n", c); // %f 소숫점 아래 7번째 줄에서 반올림되어 소숫점 아래 6자리까지만 출력됨
	
		System.out.printf("c: %.3f \n", c); // 소숫점 3번째까지 표시, 4번째에서 반올림
		//printf: 포맷 한번으로 간편하게 출력이 가능
		// 단, 지정한 포맷의 개수와 종류, 뒤에오는 변수의 개수와 종류가 정확하게 일치해야함
		
		// 문자, 문자열 테스트
		char ch='a';
		String str = "Hello";
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S \n", ch, str); // 영어 알파벳일 경우 대문자로 출력
	
	
	
	
	
	
	}
	
	
	
	
	
	
}

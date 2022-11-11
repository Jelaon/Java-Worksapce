package com.kh.operator;

public class A_Arithmetic {
	
	// 산술 연산자(이항연산자 == 두개의 값을 가지고 연산)
	// * / % + -
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 =" + (num1+num2));
		// num1+num2로 출력한다면 103, 괄호로 묶어 먼저 덧셈연산이 실행 되도록 한다
		
		System.out.println("num1 - num2 =" + (num1-num2));
		// 뺄셈의 경우 괄호로 묶어주지 않으면 String처럼 각각의 숫자로 인식하기 때문에 오류발생
		
		System.out.println("num1 * num2 =" + num1*num2);
		System.out.println("num1 / num2 =" + num1/num2);
		System.out.println("num1 % num2 =" + num1%num2);
		// 곱셈, 나눗셈, 모듈러의 경우 덧셈보다 우선순위가 높기 때문에 괄호로 안묶어도됨
		// 단, 가독성을 위해 모든 연산 시 괄호사용 권장
		
		//System.out.println(10%0);
		//java.lang.ArithmeticException :/ by zero 라는 오류발생
		//수학과 마찬가지로 0으로 나누기는 안됨
		
		double a = 35;
		double b = 10;
		
		System.out.println(a /b); // 실수끼리의 실행 결과 = 실수
		System.out.println(a %b); // 실수끼리의 실행 결과 = 실수
		
		
	}

}

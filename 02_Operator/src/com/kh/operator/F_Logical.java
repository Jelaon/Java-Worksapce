package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * 논리연산자
	 * 두 개의 논리값을 연산하는 연산자
	 * 논리값(논리연산자)논리값 > 결과값도 논리값
	 * 
	 * AND 연산자 : 논리값 && 논리값, 둘다 true = true 반환
	 * OR 연산자 : 논리값 || 논리값, 둘 중 하나만 true = true 반환
	 * 
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 '양수'이고 '짝수'인지 확인하기
		Scanner a = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요.");
		int num = a.nextInt();
		
		boolean result = (num>0)&&(num%2==0);
		// && 의미: 그리고, ~이면서, ~이고
		
		System.out.println("이 값이 '양수'이고 '짝수'입니까? \n"+result);
		
	}
	
	public void method2() {
		//사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기
		
		Scanner b = new Scanner(System.in);
		
		System.out.println("정수값을 하나 입력하세요.");
		int num1 = b.nextInt();
		
		boolean result1 = ((1<=num1)&&(num1<=100));
		System.out.println("입력한 값이 1이상 100이하의 수입니까? \n"+result1);
	
		// &&(AND): 그리고, ~이면서, ~이고, 뿐만아니라
	}
	public void method3() {
		
		// 사용자가 입력한 값이 'y' 이거나 'Y'인지 확인하기
		
		Scanner c = new Scanner(System.in);
		System.out.println("계속 진행하시려면 y 또는 Y를 입력하세요 \n");
		
		char ch = c.nextLine().charAt(0);
		
		boolean result = (ch =='y')||(ch=='Y');
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? \n" + result);

		// ||(OR): 또는, ~이거나
		// 둘 중 하나라도 true = true 반환
		
	}
	
	public void method4() {
		
		int num1 = 10;
		boolean result1 = false && (++num1>0);
		System.out.println(num1);
		System.out.println(result1);
		
		// 뒤의 비교연산 구문이 Dead code라고 뜬다
		// 실행할때 오류는 나지 않지만, 
		//result1결과 값이 어차피 false인데 왜 작성한 구문인지 물어보는 것.
		
		boolean result2 = true || (++num1>0);
		// 이것또한 뒤의 코드는 실행되지 않는 dead code
	}
}

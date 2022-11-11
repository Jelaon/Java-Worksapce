package com.kh.operator;

public class C_Compound {
	/*
	 * 복합대입연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * += -= *= /= %=
	 * 
	 * a = a+3; > a += 3
	 */
	
	public void method() {
		int num = 12;
		System.out.println("현재 num:"+ num);
		
		//num 3 증가시키기
		num = num +3;
		System.out.println("3 증가시킨 num:"+num);
		
		//num 또 3 증가시키기
		num += 3;
		System.out.println("또 3 증가시킨 num:"+num);
		
		//num을 5 감소
		num -= 5;
		System.out.println("5 감소 num:"+num);
		
		//6배 증가
		num *= 6;
		System.out.println("6배 증가 num:"+num);
		
		//2배 감소
		num /= 2;
		System.out.println("2배 감소 num:"+num);
		
		//num을 4로 나눈 나머지 값을 num에 대입
		num %= 4;
		System.out.println("최종 num:"+num);
		
		// ++의 경우 문자열 접합도 가능하다.
		String str = "Hello";
		//str = str + "World";
		str += "World";
		System.out.println(str);
		
		
		
		
		
		
		
	}

}

package com.kh.variable;

public class C_Cast {
	/*
	 *  형 변환 : 값의 자료형을 바꾸는 개념
	 *  
	 *  컴퓨터 상에서의 값 처리 규칙
	 *  1. 대입연산자(=)를 기준으로 왼족과 오른쪽은 같은 자료형이여야 함
	 * 	 > 같은 자료형에 해당하는 값만 대입이 가능함
	 * 	 > 다른 자료형의 값을 대입하고자 한다면 형 변환 필수
	 *  [표현법] 자료형 변수명 =(바꿀 자료형) 값;
	 *  
	 *  2. 같은 자료형끼리만 연산 가능
	 *   > 다른 자료형끼리 연산을 수행하고 싶다면 한 구문은 형 변환을 해야함
	 *  [표현법] 값+(바꿀 자료형) 값;
	 *  
	 *  형 변환의 종류
	 *  1. 자동형변환: 자동으로 형변환됨
	 *   작은 바이트의 자료형  > 큰 바이트의 자료형
	 *  2. 강제(명시적) 형변환 > 자동형변환이 되지 않아 강제로 형변환해야하는 경우
	 *   큰 바이트 > 작은 바이트
	 *  
	 * [표현법] (바꿀 자료형) 값;
	 * 
	 * (바꿀 자료형) == 형 변환 연산자 == cast 연산자
	 * 
	 * **boolean은 형변환 불가
	 */
	
	//자동형변환: 작은 바이트 > 큰 바이트
	public void autoCasting()	{ 
		//1. int (4byte) > double(8byte)
		int i1 = 10;
		double d1 = i1; // int는 정수형, double은 실수형이므로 10 > 10.0 저장
		
		System.out.println("d1:" + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/ i2 + d2; // 12.0+ 3.3
		System.out.println("result:" + result);
		
		//2. int (4byte) > long(8byte)
		int i3 = 1000;
		long l3 = i3;
		
		long l4 = 2000; // L을 붙이지 않아도 됨 자동형변환이 되기때문 // f는 반드시 붙여야함
		
		//3. 특이케이스 long(8byte) > float(4byte)
		// 정수 < 실수
		// 실수가 정수보다 담을 수 있는 값의 범위가 더 크다 > 자동형변환 됨
		
		long l5 = 10000000000L;
		float f5 = l5;
		
		System.out.println("f5:" + f5);
		
		//4. 특이케이스 char(2byte) <-> int(4byte) : 양방향 형변환 가능
		char ch ='A';
		System.out.println("ch:" + ch);
		
		int num = 'A';
		System.out.println("num:" + num);
		
		/*
		 * char의 범위 0~65xxx : 각 문자마다 고유의 정수값이 정해져있다. 따라서 쌍방향 전환이 가능하다. 음수값은 오류남
		 * 참고: 아스키코드표
		 * 		유니코드표
		 */
		System.out.println((int)'김');
		
		int sum = 'A'+10; // 문자와 정수 사이에 연산이 가능하다
		System.out.println(sum);
		
		//5. 특이케이스 byte와 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		byte b3= (byte)(b1 + b2); // b1+b2는 11이다. 정수가 나온다. 그러므로 강제 형변환해야함
		// byte로 연산시 연산결과의 정수값은 무조건 int로 취급한다.
		System.out.println(b3);
		
	}
	// 강제(명시적)형변환 : 큰 크기 자료형 > 작은 크기
	public void forceCasting() {
		// 1. double(8byte) > float(4byte)
		float f1 = 4.0f;
		
		double d2 = 8.0;
		float f2 = (float) d2;
		
		// 2. double(8byte) > int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 실수->정수로 형변환이므로 '데이터손실' 이루어짐
		System.out.println(i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		/*iNum이 double형으로 우선 변환 10 > 10.0
		 10.0+5.89 = 15.89 실수값이 반환
		 반환값이 실수형이므로 int형에 대입 불가능
		 [해결방법]
		 1. 연산결과를 int형으로 맞춰서 강제형변환 */
		int iSum = (int)(iNum + dNum);
		
		/* [해결방법]
		 2. 덧셈 연산 전에 dNum변수를 미리 int형으로 강제 형변환 */
		int iSum2 = iNum + (int) dNum;
		
		/* [해결방법]
		 3. 실수값을 정수형으로 강제변환시 소수점 아래 부분은 데이터 손실됨
		 애초에 결과를 실수형으로*/
		double dSum = iNum + dNum;
		
		System.out.println("iNum:"+iSum+", iSum2 :"+iSum2+", dSum :"+dSum);
		
		// 데이터손실 테스트
		int iNum2 = 290;
		byte bNum2 = (byte) iNum2;
		
		// -128~127
		System.out.println("bNum2:"+bNum2);
		
		
		
		
		
	}

}

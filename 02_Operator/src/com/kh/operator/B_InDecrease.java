package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감연산자(단항연산자) ++ --
	 * ++: 변수에 담긴 값을 1 증가시키는 연산자
	 * 	  ++변수(전위연산자) 변수++(후위연산자)
	 * --: 변수에 담긴 값을 1 감소시키는 연산자
	 * 	  --변수(전위연산자) 변수--(후위연산자)
	 * 
	 * (증감연산자)변수: 전위연산 > 선증감 후처리
	 * 변수(증감연산자): 후위연산 > 선처리 후증감
	 */
	public void method1() {
		//전위연산 테스트
		int num = 10;
		System.out.println("전위연산 적용 전 num:"+num);
		System.out.println("1회 수행 후 결과:"+ ++num);
		System.out.println("2회 수행 후 결과:"+ ++num);
		System.out.println("3회 수행 후 결과:"+ ++num);
		
		System.out.println("최종 num의 값:"+num);
		System.out.println("=======================================");
		
		//후위연산 테스트
		int num2 = 10;
		System.out.println("전위연산 적용 전 num:"+num2);
		System.out.println("1회 수행 후 결과:"+ num2++);
		System.out.println("2회 수행 후 결과:"+ num2++);
		System.out.println("3회 수행 후 결과:"+ num2++);
		
		System.out.println("최종 num의 값:"+num2);
		
	}
	
	public void method2() {
		//전위연산
		int a = 10;
		int b = ++a;
		System.out.println("a :"+a+",b:"+b);
		
		//후위연산
		int c = 10;
		int d = c++;
		System.out.printf("c:%d, d:%d",c, d);
		
		//===========================
		//예측
		int num = 20;
		System.out.println("현재 num:" + num);//20
		System.out.println("++num:"+ ++num);//21
		System.out.println("num++:"+ num++);//21
		System.out.println("--num:"+ --num);//21
		System.out.println("num--:"+ num--);//21
		System.out.println("최종 num:"+ num);//20
	}
		
		public void method3() {
			
			int num1 = 20;
			int result1 = num1++ *3;
			System.out.println(num1);
			System.out.println(result1);
			
			int num2 = 20;
			int result2 = ++num2 *3;
			System.out.println(num2);
			System.out.println(result2);
		}
		public void method4() {
			int a = 10;
			int b = 20;
			int c = 30;
			
			// 주석으로 어떻게 값이 출력될지 예상해보기
			System.out.println(a++);// 10 출력, a 11 b 20 c 30
			System.out.println((++a)+(b++));// 32 출력, a 12 b 21 c 30
			System.out.println((a++)+(--b)+(--c));// 12+20+29 = 61 출력, a 13 b 20 c 29
			System.out.println("a:"+a+", b:"+b+", c:"+c);//a 13 b 20 c 29 출력

		}
		public void quiz() {
			int a = 5;
			int b = 10;
			
			int c= (++a) +b;
			int d = c / a;
			int e = c % a;
			int f = e++;
			int g = (--b)+(d--);
			int h = 2;
			int i = (a++)+b/(--c/f)*(g-- - d)%(++e+h);
			
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			System.out.println("c:"+c);
			System.out.println("d:"+d);
			System.out.println("e:"+e);
			System.out.println("f:"+f);
			System.out.println("g:"+g);
			System.out.println("h:"+h);
			System.out.println("i:"+i);
			
			
			
}}

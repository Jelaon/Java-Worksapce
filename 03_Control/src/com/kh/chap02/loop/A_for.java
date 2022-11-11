package com.kh.chap02.loop;

import java.util.Scanner;

public class A_for {
	
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨(for문, while문(DO_WHILE))
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식{ //세미콜론을 통해서 구분, 무조건 있어야함(세미콜론)
	 * 		반복적으로 실행시키고자하는 코드;}
	 * 
	 * - 초기식: 반복문이 시작될 때 '초기에 딱 한번만 실행'되는 구문
	 * 		(반복문에서 사용할 변수를 선언 및 초기화할 때 사용)
	 * - 조건식: 반복문이 수행될 조건을 작성하는 구문
	 * 		조건식의 결과가 true이면 반복문 실행
	 * 		조건식의 결과가 false면 반복문 멈추고, 빠져나옴
	 * 		(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * - 증감식: 반복문을 제어하는 변수값을 증감시키는 구문
	 * 		(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 		ex) i++, i+=1
	 * 
	 * for문을 만나는 순간
	 * 초기식>조건식(조건검사)> true일 경우 실행할 코드 실행 > 증감식
	 * 		>조건식(조건검사)> true일 경우 실행할 코드 실행 > 증감식
	 * 		>조건식(조건검사)> false일 경우 빠져나옴.
	 * 매번 조건식의 조건검사 결과값을 가지고 조건이 true일 경우만 반복해서 실행한다.
	 * 
	 * 알아둘 것:
	 * for문안에 초기식, 조건식, 증감식 각각 생략이 가능하긴함.
	 * 단, 반드시 ;은 작성해줘야함.
	 */
	
	public void method1() {
		//안녕하세요 5번 출력
		
		/*System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("안녕하세요");
		}
		//int i = 0;
		//for(; i<=4; i++) {
		//	System.out.println("야호");
		//}
		for(int i = 1; i<10; i+=2) {
			System.out.println("무야호");
		}
	}
	
	public void method2() {
		//1~5 출력
		// i값이 1부터 6보다 작을때까지 1씩 증가할동안 반복 수행
		
		for(int i=1; i<6; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=5; i>0; i--) {
			System.out.print(i+" ");
		}
	}
	public void method3() {
		//i값이 1에서부터 10 사이의 홀수만 출력
		//1 3 5 7 9
		
		for(int i=1; i<10; i+=2) {
			System.out.print(i+" ");
	}
	}
	public void method4() {
		//1 2 3 4 5 6 7 8 9 10
		
		for(int i=0; i<=9; i++) {
			System.out.print(i+1+" ");
	}
	}
	public void method5() {
		// 1~10 합계
		//방법1. int sum = 1+2+...+9+10
		//방법2. int sum = 0 선언 후
		// sum +=1; sum+=2; ...
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			 sum += i;
		}
		System.out.print("1부터 10까지의 총 합계:"+sum);
	}
	public void method6() {
		//1에서부터 사용자가 입력한 숫자까지 모두 더해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력해주세요");
		int a = sc.nextInt();
		
		int sum =0;
		for(int i=1; i<=a; i++) {
			sum += i;
		}
		System.out.print("1부터 "+a+"까지의 합계는 "+sum);
		
	}
	
	public void method8() {
		//1부터 매번 달라지는 랜덤값(1~10)까지의 총 합계
		/*
		 * java.lang.Math 클래스에 이미 정의되어있는 random()메소드를 호출하여 랜덤값 생성가능
		 * 
		 * random() : 0.0 ~ 0.999999999...사이의 랜덤값 발생
		 * 0.0 <= 랜덤값 < 1.0
		 */
		
		/*Math m = new Math();
		m.random();
		
		 int random = (int) Math.random(); //  소수점이라 int로 안됨
		 그럼 어떻게 할까? 우선 10 곱해보기
		 0.0 <=10*랜덤값 < 10.0
		 1을 더하면
		 1.0<=10*랜덤값+1 < 11.0
		 소수점을 버리면 , 원하는 범위의 정수 랜덤값 가져올 수가 있음
		 1 <= 랜덤값 <= 10
		
		[표현법]
		Math.random() * 출력하고자하는 개수 + 시작하고 싶은 수
		시작수 ~ (시작 수 + 출력하고자 하는 개수)
		*/
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println(random);
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총 합은 %d", random, sum);
		
	}
	
	public void method9() {
		
		//반복문 + String
		String str = "hello";
		/*
		 * h > str.charAt(0);
		 * e > str.charAt(1);
		 * l > str.charAt(2);
		 * l > str.charAt(3);
		 * o > str.charAt(4);
		 * 
		 * 규칙찾기. 우선 반복적으로 str.charAt을 호출함
		 * 인덱스에 해당하는 숫자만 0부터 1씩 4까지 증가함
		 * 마지막 인덱스 = 문자열의 길이 -1 // 왜냐하면 처음이 1이 아니라 0부터 시작이니까
		 * 0 ~ (문자열의 길이 -1)까지 매번 1씩 증가
		 * 
		 */
		
		for(int i =0; i <=4; i++) {
			System.out.println(str.charAt(i));
		}
	}
	public void method10() {
		//사용자에게 문자열 입력받아 각 인덱스별로 문자를 하나씩 뽑아서 출력
	
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : "+str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method11() {
		//구구단 출력(2단)
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 */
		int gugudan = 2;
		int sum = 0;
		for(int i=1; i<10; i++) {
			sum = gugudan*i;
			System.out.printf("%d X %d = %d \n", gugudan, i, sum);
		}
		
	}
	public void method12() {
		// 사용자가 입력단 한을 출력
		// 단수가 2단 ~ 9단까지의 범위가 아니라면 잘못입력했습니다(2~9사이의 정수 입력)
		// 제대로 입력했다면 해당 단수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 :");
		int gugudan = sc.nextInt();
		int sum = 0;
		
		if(gugudan>=2 && gugudan<=9) {
			for(int i=1; i<10; i++) {
				sum = gugudan*i;
				System.out.printf("%d X %d = %d \n", gugudan, i, sum);
		} 
			}
		else { System.out.println("잘못 입력했습니다. (2~9 사이의 정수 입력)");
		}
		
		
	}
	
	public void method13() {
		// 1~5까지 연이어서 출력
		// 반복문 사용
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
	public void method14() {
		//*****
		//*****
		//*****
		//*****
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void method15() {
		//1*** > 1행 1열때 숫자1표시
		//*2** > 2행 2열때 숫자2표시
		//**3* > 3행 3열때 숫자3표시
		//***4 > 4행 4열때 숫자4표시
		for(int j=1; j<5; j++) {
			for(int i = 1; i<5; i++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}	System.out.println();
		}

	
	
	}
	public void method16() {
	// 구구단 2단부터 ~ 9단까지 모두 출력
		
		int dan = 2;
		
		for(; dan<=9; dan++) {
			System.out.printf(" --- %d 단 --- \n", dan);
			for(int i =1; i<=9; i++) {
				System.out.printf("%d X %d = %d", dan, i, dan*i);
				System.out.println();
			} 
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}

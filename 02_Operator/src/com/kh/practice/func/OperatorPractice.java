package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int a = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int b = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d \n", b/a);
		System.out.printf("남는 사탕 개수 : %d \n", b%a);
	}
	
	public void practice2() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		//이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String a = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int b = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int c = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int d = sc.nextInt();
		//System.out.print("성별(M/F) : ");
		//char e = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double f =sc.nextDouble();
		
		//String result = e == 'M' ? "남학생" : "여학생";
		System.out.println(b+"학년 "+c+"반 "+"번 "+a+"성적은 "+f+"이다.");
	}
	
	public void practice3() {
	//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
	//	성인(19세 초과)인지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
		String result = (a<= 13 ? "어린이" : ((a>13 && a<=19) ? "청소년" : "성인"));
		System.out.println(result);
	
	}
	
	public void practice4() {
		
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("영어 : ");
		int b = sc.nextInt();
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		System.out.printf("합계 : %d \n", a+b+c);
		//System.out.printf("평균 : %f \n", (a+b+c)/3);
		System.out.println((a>=40 && b>=40 && c>=40 && ((a+b+c)/3)>=60) ? "합격" : "불합격");
		
		
	}
	
	public void practice5() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) :");
		String a = sc.nextLine();
		System.out.print(a.charAt(8) == 1 ? "남자" : "여자");
	}
	
	

}

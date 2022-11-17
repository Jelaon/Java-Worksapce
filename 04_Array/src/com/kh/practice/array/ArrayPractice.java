package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int a [] = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = i+1;
			System.out.print(a[i]+" ");
		}
		
	}
	public void practice2() {
		int a [] = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = a.length-i;
			System.out.print(a[i]+" ");
		}
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int a = sc.nextInt();
		int b [] = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = i+1;
			System.out.print(b[i]+" ");
		}
		
	}
	public void practice4() {

		String a []= {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(a[1]);
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 :");
		String a = sc.nextLine();
		char b [] = new char[a.length()];
		for(int i =0; i < a.length(); i++) {
			b[i] = a.charAt(i);
		}
		System.out.print("문자 :");
		char c = sc.nextLine().charAt(0);
		
		System.out.printf("%s 에 %c 가 존재하는 위치(인덱스) : ", a, c );
		
		int sum = 0;
		for(int i =0; i< b.length; i++) {
			if (b[i] == c) {
				System.out.print(i+" ");
				sum++;
			}
		}System.out.println();
		System.out.printf("%c 개수 : %d", c, sum);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String str [] = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0 ~ 6 사이 숫자 입력 :");
		int a = sc.nextInt();
		if(a>=0 && a<=6) {
			System.out.printf("%s요일",str[a]);

	}else {
		System.out.println("잘못 입력하셨습니다.");
	}
}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int a = sc.nextInt();
		int aa [] = new int[a];
		int sum =0;
		
		for(int i=0; i<a; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 :", i);
			aa[i] = sc.nextInt();
			sum += aa[i];
		}
		for(int i=0; i<a; i++) {
		System.out.print(aa[i]+" ");
		} 
		System.out.println();
		System.out.println("총합: "+sum);
		
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		int b [] = new int[a];
		int i =0;
		
			if(a % 2 != 0 && a>=3) {
			for(; i <= a/2; i++) {
				b[i] = i+1;
				 	System.out.print(b[i]+", ");
				}
			for(; i < a; i++) { 
				b[i] = b[i-1]-1;
					if(i != a-1) {
						System.out.print(b[i]+", "); 
					}else {
						System.out.print(b[i]); 
				}
			}
			
		}else {
			System.out.println("다시 입력하세요.");
			practice8();
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String a = sc.nextLine();
		String b [] = {"ㅇㅇ", "ㄴㄴ", "ㄷㄷ"};
		
		for(int i = 0; i < b.length; i++) {

		if(a.equals(b[i])) {
			System.out.printf("%S 치킨 배달 가능", a);
			} return;
		}
		System.out.printf("%S치킨은 없는 메뉴입니다.", a);
	}
}	


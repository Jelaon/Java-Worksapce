package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {
	public static void main(String[] args) {
		
//	public static void main(String[] args) {
//		FieldTest1 f1 = new FieldTest1(); // 객체 생성시 global 전역변수 할당
//
//		f1.test(109); //test메서드 호출 시 num, local 변수 할당
//						// test메서드 종료 시 num, local 변수 소멸
//		f1 = null; // 객체 소멸시 global 멤버변수 소멸
//		
//	}

//	FieldTest2 f2 = new FieldTest2();
//	//public > 어디서든 직접 접근 가능
//	System.out.println(f2.pub);
//	
//	//protected > 같은 패키지에서는 직접 접근 가능, 다른 패키지에서는 직접접근 불가
//	//System.out.println(f2.pro);
//	
//	//default => 같은 패키지에서만 직접접근 가능
//	//System.out.println(f2.df);
//	
//	//private > 해당 클래스에서만 접근 가능
//	//System.out.println(f2.pri);
//	
//	//System.out.println(FieldTest2.sta);
	
	System.out.println(Math.PI);
	
	FieldTest3.num = 500;
	System.out.println(FieldTest3.num);
	
	//상수필드 출력
	System.out.println(FieldTest3.NUM);
	//System.out.println(NUM);
	//FieldTest3.NUM = 500; // > 상수이기때문에 값 변경 불가
	}
}
